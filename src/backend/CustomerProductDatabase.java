package backend;

import backend.CustomerProduct;
import backend.Database;
import backend.Mix;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    class CustomerProductDatabase extends Database {

    public CustomerProductDatabase(String filename) {
        super(filename);
    }

    @Override
    public Mix createRecordFrom(String line) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String[] parts = line.split(",");
        String customerId = parts[0];
        String productID = parts[1];
        LocalDate purchaseDate = LocalDate.parse(parts[2], dateFormatter);
        return new CustomerProduct(customerId, productID, purchaseDate);
    }

    @Override
    public void insertRecord(Mix record) {
        if (!contains(record.getSearchKey())) {
            returnAllRecords().add(record);
        } else {
            System.out.println("the operation ");
        }
    }

}
