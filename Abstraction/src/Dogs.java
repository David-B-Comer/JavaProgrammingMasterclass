public class Dogs extends Animals{

    public Dogs(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

}
