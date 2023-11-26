package Builder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class App {
    List<Account> accountList = new ArrayList<>();
    List<Order> orderHistory = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    
    private static final String dbConn = "jdbc:mysql://localhost:3306/dictionary";
    private static final String username = "root";
    private static final String password = "nhienhy6714";
    
    public App() {
    }
    
    public void loadDataFromDB() {
        
    }
    
    public void orderProducts(List<Product> products) {
        
    }
    
    public static void main(String[] args) {

    }
}
