package backend;

import java.io.*;
import java.util.ArrayList;

class EmployeeUserDatabase extends Database {

    public EmployeeUserDatabase(String filename) {
        super(filename);
    }

    @Override
    public Mix createRecordFrom(String line) {
        String[] data = line.split(",");
        String employeeId = data[0];
        String name = data[1];
        String email = data[2];
        String address = data[3];
        String phoneNumber = data[4];
        return new EmployeeUser(employeeId, name, email, address, phoneNumber);
    }

    @Override//insertRecord method in superclass database
    public void insertRecord(Mix records) {
        if (contains(records.getSearchKey()) == false) {
            returnAllRecords().add(records);
        } else {
            System.out.println("product already exists");
        }
    }
}
