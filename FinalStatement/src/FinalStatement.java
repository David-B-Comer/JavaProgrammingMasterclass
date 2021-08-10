public class FinalStatement {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public FinalStatement(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
    }

}
