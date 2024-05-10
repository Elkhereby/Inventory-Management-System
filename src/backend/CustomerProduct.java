package backend;

import backend.Mix;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerProduct implements Mix{
    private String customerSSN;
    private String productID;
    private LocalDate purchaseData;
    
    public CustomerProduct(String customerSSN, String productID, LocalDate purchaseDate){
        this.customerSSN = customerSSN;
        this.productID = productID;
        this.purchaseData = purchaseDate;
    }

    public String getCustomerSSN() {
        return customerSSN;
    }

    public String getProductID() {
        return productID;
    }

    public LocalDate getPurchaseData() {
        return purchaseData;
    }
    
    @Override
    public String lineRepresentation(){
        return customerSSN + "," + productID + "," + purchaseData.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    @Override
    public String getSearchKey(){
        return customerSSN + "," + productID + "," + purchaseData.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
