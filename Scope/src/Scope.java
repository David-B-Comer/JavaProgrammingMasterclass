public class Scope {

    public static void main(String[] args) {

        String var4 = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("scopeInstance private var is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();
        System.out.println("******************");


        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();


    }
}
