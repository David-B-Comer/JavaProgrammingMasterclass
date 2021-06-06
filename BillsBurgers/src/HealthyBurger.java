public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1() {

        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;

        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);

    }

    public void addHealthyAddition2() {

        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;

        System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);

    }
}
