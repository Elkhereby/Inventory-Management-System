package backend;

import backend.CustomerProductDatabase;
import backend.CustomerProduct;
import backend.Mix;
import constants.FileNames;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeRole {
   
    
    private ProductDatabase productsDatabase = new ProductDatabase(FileNames.PRODUCT_FILENAME);
    private CustomerProductDatabase cutomerProductDatabase = new CustomerProductDatabase(FileNames.CUSTOMERPRODUCT_FILENAME);

    public EmployeeRole() throws IOException {
       productsDatabase.readFromFile();
       cutomerProductDatabase.readFromFile();
    }
    
    public boolean productExists(String productID) {
        return productsDatabase.contains(productID);
    }
    public void addProduct(String productID, String productName, String manufacturerName, String supplierName, int quantity, float price) throws IOException {
        Product newProduct = new Product(productID, productName, manufacturerName, supplierName, quantity, price);
        productsDatabase.insertRecord(newProduct);
    }

    public Product[] getListOfProducts() throws IOException {
        ArrayList<Mix> productList = productsDatabase.returnAllRecords();

        Product[] productArray = new Product[productList.size()];

        for (int i = 0; i < productList.size(); i++) {
            productArray[i] = (Product) productList.get(i);
        }
        return productArray;
    }

    public CustomerProduct[] getListOfPurchasingOperations() throws IOException {
        ArrayList<Mix> customerProductList = cutomerProductDatabase.returnAllRecords();
        CustomerProduct[] customerProductArray = new CustomerProduct[customerProductList.size()];
        for (int i = 0; i < customerProductList.size(); i++) {
            customerProductArray[i] = (CustomerProduct) customerProductList.get(i);
        }
        return customerProductArray;
    }

    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate) throws IOException {
        Product product = (Product) productsDatabase.getRecord(productID);
        if (product == null) 
            return false;
        if(product.getQuantity() == 0)
            return false;
        else{
            CustomerProduct customerProduct = new CustomerProduct(customerSSN, productID, purchaseDate);
            cutomerProductDatabase.insertRecord(customerProduct);
            product.setQuantity(product.getQuantity() - 1);
            
            return true;
        }
    }

    public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate, LocalDate returnDate) throws IOException {
        if (returnDate.isBefore(purchaseDate) || returnDate.isAfter(purchaseDate.plusDays(14))) {
            return -1;
        }

        Product product = (Product) productsDatabase.getRecord(productID);
        if (product == null || !cutomerProductDatabase.contains(customerSSN + "," + productID + "," + purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))) {
            return -1;
        }

        product.setQuantity(product.getQuantity() + 1);
        cutomerProductDatabase.deleteRecord(customerSSN + "," + productID + "," + purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        return product.getPrice();
    }

    public ProductDatabase getProductsDatabase() {
        return productsDatabase;
    }

    public void setProductsDatabase(ProductDatabase productsDatabase) {
        this.productsDatabase = productsDatabase;
    }

    public CustomerProductDatabase getCutomerProductDatabase() {
        return cutomerProductDatabase;
    }

    public void setCutomerProductDatabase(CustomerProductDatabase cutomerProductDatabase) {
        this.cutomerProductDatabase = cutomerProductDatabase;
    }

    public void logout()  {
        try {
            productsDatabase.saveToFile();
            cutomerProductDatabase.saveToFile();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
