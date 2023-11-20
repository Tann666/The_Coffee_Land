public class Account implements Builder {
    private String userName;
    private String passWord;
    private int accNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Account() {
    }

    public Account(String userName, String passWord, int accNumber, String firstName, String lastName, String phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.accNumber = accNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Builder buildUserName(String username) {
        this.userName = username;
        return this;
    }

    @Override
    public Builder buildPassWord(String password) {
        this.passWord = password;
        return this;
    }

    @Override
    public Builder buildName(String name) {
        String[] part = name.split(" ");
        this.firstName = part[0];
        StringBuffer n = new StringBuffer();
        for (int i = 1; i < part.length; i++) {
            n.append(part[i]).append(" ");
        }
        this.lastName = n.toString();
        return this;
    }

    @Override
    public Builder buildPhone(String phone) {
        this.phoneNumber = phone;
        return this;
    }

    @Override
    public Builder buildAccNumber(int number) {
        this.accNumber = number;
        return this;
    }

    @Override
    public Account Builder() {
        return new Account(userName, passWord, accNumber, firstName, lastName, phoneNumber);
    }

}
