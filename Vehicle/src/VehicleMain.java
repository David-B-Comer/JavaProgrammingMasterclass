public class VehicleMain {

    public static void main(String[] args) {
        Jeep jeep = new Jeep(36);
        jeep.steer(45);
        jeep.accelerate(30);
        jeep.accelerate(20);
        jeep.accelerate(-42);
    }
}
