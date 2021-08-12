public class FinalStatementMain {

    public static void main(String[] args) {

        FinalStatement one = new FinalStatement("one");
        FinalStatement two = new FinalStatement("two");
        FinalStatement three = new FinalStatement("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);


        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);

    }
}
