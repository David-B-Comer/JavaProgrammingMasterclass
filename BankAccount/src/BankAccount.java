public class BankAccount {


    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(100.0);

        bankAccount.deposit(50.0);
        bankAccount.withdraw(100.0);

        bankAccount.deposit(51.0);
        bankAccount.withdraw(100.0);


        BankAccount myBankAccount = new BankAccount("Dave", "Dave@email.com", "12345");
        System.out.println(myBankAccount.getAccountNumber() + " name " + myBankAccount.getCustomerName());
    }



    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this("56789", 2.50, "Default name", "Default email", "Default number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Only " + this.balance + " available. Withdraw not processed");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw of " + amount + " processed. Remaining balance = " + this.balance);

        }
    }

}
