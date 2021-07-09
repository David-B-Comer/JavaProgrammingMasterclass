public class Birds extends Animals{

    public Birds(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }
}
