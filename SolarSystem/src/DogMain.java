public class DogMain {

    public static void main(String[] args) {

        Labrador rover = new Labrador("Rover");
        DogEquals rover2 = new DogEquals("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

    }

}
