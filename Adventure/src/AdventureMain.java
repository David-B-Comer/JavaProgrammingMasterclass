import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureMain {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
    }
}
