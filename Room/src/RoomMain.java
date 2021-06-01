public class RoomMain {

    public static void main(String[] args) {

        Walls wall1 = new Walls("North");
        Walls wall2 = new Walls("South");
        Walls wall3 = new Walls("East");
        Walls wall4 = new Walls("West");

        Ceiling ceiling = new Ceiling(12, 55);

        Desk desk = new Desk("Executive", 60, 30, 30, "Mahogany");

        Light light = new Light("Ceiling Fan", false, 3);


        Room office = new Room("Office", wall1, wall2, wall3, wall4, ceiling, desk, light);
        office.tidyDesk();
        office.getLight().turnOn();
    }
}
