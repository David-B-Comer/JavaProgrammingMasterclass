public class Scope {

    public static void main(String[] args) {

        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("scopeInstance private var is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

    }
}
