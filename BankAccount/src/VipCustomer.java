public class VipCustomer {

    public static void main(String[] args) {

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Dave", 25000.00);
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("David", 100000.00, "David@email.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmail());
    }

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("New Customer", 50000.00, "newcustomer@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
