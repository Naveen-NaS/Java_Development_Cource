package Introduction;

public class Access_Modify {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.userName = "Naveen Sharma";
        acc1.setPassword("naveen123456");
        System.out.println(acc1.userName);

        // We can't access below line because of Access modifier is set to "Private"
        // System.out.println(acc1.password);
    }
}

class BankAccount {
    // Here public keyword is Access modify which means we can access username
    // publically.
    public String userName;

    // Here private keyword is Access modify which means we can't access password
    // publically.
    private String password;

    void setPassword(String pwd) {
        this.password = pwd;
        System.out.println(this.password);
    }
}
