package Builder;

public class Store {
    private int storeNumber;
    private String phone;
    private Address address;

    public Store() {
    }

    public Store(int storeNumber, String phone, Address address) {
        this.storeNumber = storeNumber;
        this.phone = phone;
        this.address = address;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
