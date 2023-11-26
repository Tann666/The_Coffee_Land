package Builder;

public class Product {
    private int productNumber;
    private String productName;
    private double value;
    private String type;
    private String description;

    public Product() {
    }

    public Product(int productNumber, String productName, double value, String type, String description) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.value = value;
        this.type = type;
        this.description = description;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
