public class Jeep extends Car1{

    private int roadServiceMonths;

    public Jeep(int roadServiceMonths) {
        super("Jeep", "4WD", 4, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
