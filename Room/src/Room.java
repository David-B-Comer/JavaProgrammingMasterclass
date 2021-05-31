public class Room {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Desk desk;
    private Light light;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Desk desk, Light light) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.desk = desk;
        this.light = light;
    }

    public Light getLight() {
        return this.light;
    }
}
