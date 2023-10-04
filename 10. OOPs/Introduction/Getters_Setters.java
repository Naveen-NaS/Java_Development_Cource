package Introduction;

public class Getters_Setters {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.userName = "Naveen Sharma";
        acc1.setPassword("naveen1234");

        System.out.println("User name : " + acc1.userName);
        System.out.println("Password : " + acc1.getPassword());
    }
}

class BankAccount {
    public String userName;
    private String password;

    // As password is private, so we use get function to display it's value
    String getPassword() {
        return this.password; // "this" keyword return current value of object.
    }

    void setPassword(String pwd) {
        password = pwd;
    }
}
