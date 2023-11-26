package Builder;

public class Employee extends Account {
    private String jobTitle;
    private Address address;

    public Employee() {
    }
    
    public Employee(String jobTitle, Address address) {
        this.jobTitle = jobTitle;
        this.address = address;
    }

    public Employee(String jobTitle, Address address, String userName, String passWord, int accNumber, String firstName, String lastName, String phoneNumber) {
        super(userName, passWord, accNumber, firstName, lastName, phoneNumber);
        this.jobTitle = jobTitle;
        this.address = address;
    }
    
}
