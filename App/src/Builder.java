public interface Builder {
    Builder buildUserName(String username);
    Builder buildPassWord(String password);
    Builder buildName(String name);
    Builder buildPhone(String phone);
    Builder buildAccNumber(int number);
    
    Account Builder();
}
