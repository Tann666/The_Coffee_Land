package Builder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Customer extends Account {
    private int Point = 0;
    private List<Order> orderList = new ArrayList<>();

    public Customer() {
    }

    public Customer(int Point, String userName, String passWord, int accNumber, String firstName, String lastName, String phoneNumber) {
        super(userName, passWord, accNumber, firstName, lastName, phoneNumber);
        this.Point = Point;
    }
    
    public void acceptOrder(Order order) {
        order.setStatus(true);
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        order.setActualDate(new SimpleDateFormat("d/M/yyyy").format(date));
        Point += order.getBonusPoint();
    }
    
    public void cancelOrder(Order order) {
        order.setStatus(false);
        order.setExpectedDate(null);
        order.setActualDate(null);
    }

}
