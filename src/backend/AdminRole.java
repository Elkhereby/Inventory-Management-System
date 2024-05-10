package backend;

import constants.FileNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AdminRole {

    private final EmployeeUserDatabase database = new EmployeeUserDatabase(FileNames.EMPLOYEE_FILENAME);

    public AdminRole() throws IOException {
        database.readFromFile();
    }

    public boolean employeeExists(String empID) {
        return database.contains(empID);
    }

    public void addEmployee(String employeeId, String name, String email, String address, String phoneNumber) throws IOException {
        EmployeeUser newEmployee = new EmployeeUser(employeeId, name, email, address, phoneNumber);
        database.insertRecord(newEmployee);
    }

    public EmployeeUser[] getListOfEmployees() {//return array fi kol employees li fi file
        ArrayList<Mix> employeeList = database.returnAllRecords(); //ArrayList resizable array
        EmployeeUser[] employees = new EmployeeUser[employeeList.size()];
        return employeeList.toArray(employees);
    }

    public void removeEmployee(String key) throws IOException {

        if (database.contains(key)) {
            database.deleteRecord(key);
        } else {
            System.out.print("Employee is not found");
        }
    }

    public void logout(){
        try {
            database.saveToFile();
        } catch (IOException ex) {
            Logger.getLogger(AdminRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
