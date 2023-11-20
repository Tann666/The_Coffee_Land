public class Customer extends Account {
    private int Point = 0;

    public Customer() {
    }

    public Customer(int Point, String userName, String passWord, int accNumber, String firstName, String lastName, String phoneNumber) {
        super(userName, passWord, accNumber, firstName, lastName, phoneNumber);
        this.Point = Point;
    }
    
    public static void main(String[] args) {
        Customer c = (Customer) new Customer().buildName("acv");
        System.out.println(c.getFirstName());
    }
}
