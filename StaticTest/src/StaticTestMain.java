public class StaticTestMain {

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
    }

}
