import java.util.List;

public class TheatreMain {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);

    }

    public static void printList(List<Theatre.Seat> list) {

        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================================");

    }

}
