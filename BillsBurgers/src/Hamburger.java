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

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {

        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;

        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String name, double price) {

        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;

        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);

    }

    public void addHamburgerAddition3(String name, double price) {

        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;

        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);

    }

    public void addHamburgerAddition4(String name, double price) {

        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;

        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);

    }

    public double itemizehamburger() {

        System.out.println(name + "on a " + breadRollType + " with " + meat + ", price is " + price);
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);


        double totalPrice = price + addition1Price + addition2Price + addition3Price + addition4Price;
        System.out.println("Total " + name + " price is " + totalPrice);

        return totalPrice;
    }
}
