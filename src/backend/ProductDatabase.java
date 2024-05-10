package backend;

import backend.Product;
import backend.Database;
import java.util.ArrayList;
import java.io.*;

class ProductDatabase extends Database{

    public ProductDatabase(String filename) {
        super(filename);
    }


    @Override
    public Product createRecordFrom(String line) {
        String[] data = line.split(",");
        String productID = data[0];
        String productName = data[1];
        String manufacturerName = data[2];
        String supplierName = data[3];
        int x = Integer.parseInt(data[4]);
        float y = Float.parseFloat(data[5]);
        return new Product(productID, productName, manufacturerName, supplierName, x, y);
    }

    public void insertRecord(Product record){
        if(contains(record.getSearchKey())==false)
            returnAllRecords().add(record);
        else
            System.out.println("product already exists");
    }

}

