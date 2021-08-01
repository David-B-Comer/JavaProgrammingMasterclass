public class Scope {

    public static void main(String[] args) {

        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("scopeInstance private var is " + scopeInstance.getVar1());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("******************");


        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();


    }
}
