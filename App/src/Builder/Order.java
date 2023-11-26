package Builder;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Account account;
    private List<Product> productList = new ArrayList<>();
    private Store store;
    private boolean status;
    private String orderDate;
    private String expectedDate;
    private String actualDate;
    private int bonusPoint;
    private double value = 0;
    public static final int BONUS = 10;

    public Order() {
    }

    public Order(int orderNumber, Account account, Store store, boolean status, String orderDate, String expectedDate, String actualDate) {
        this.orderNumber = orderNumber;
        this.account = account;
        this.store = store;
        this.status = status;
        this.orderDate = orderDate;
        this.expectedDate = expectedDate;
        this.actualDate = actualDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
    
    public void addProduct(Product product) {
        if (status) return;
        productList.add(product);
        value += product.getValue();
        bonusPoint = (int) ((value/100000) * BONUS);
    }
    
    public void delProduct(Product product) {
        if (status) return;
        productList.remove(product);
        value -= product.getValue();
        bonusPoint = (int) ((value/100000) * BONUS);
    }
}
