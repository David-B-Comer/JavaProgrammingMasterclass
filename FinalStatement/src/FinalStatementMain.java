public class FinalStatementMain {

    public static void main(String[] args) {

        FinalStatement one = new FinalStatement("one");
        FinalStatement two = new FinalStatement("two");
        FinalStatement three = new FinalStatement("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);
    }
}
