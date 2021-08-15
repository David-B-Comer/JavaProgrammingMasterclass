public class SIBTest {

    public static final String owner;

    static {
        owner = "Dave";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd static initialization block called");
    }
}
