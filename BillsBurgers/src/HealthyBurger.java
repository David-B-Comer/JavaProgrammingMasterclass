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
        this.healthyExtra2Name = healthyExtra2Name;

        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);

    }
}
