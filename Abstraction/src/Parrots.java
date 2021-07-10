public class Parrots extends Birds {

    public Parrots(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }

}
