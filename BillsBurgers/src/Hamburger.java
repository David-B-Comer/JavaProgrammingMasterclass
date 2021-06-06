public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType,
                     String addition1Name, double addition1Price, String addition2Name, double addition2Price,
                     String addition3Name, double addition3Price, String addition4Name, double addition4Price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {

        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String name, double price) {

        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String name, double price) {

        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String name, double price) {

        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizehamburger() {

        System.out.println("Hamburger toppings: " + meat + ", " + breadRollType + ", " + addition1Name + ", " + addition2Name + ", " + addition3Name + ", " + addition4Name);
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
