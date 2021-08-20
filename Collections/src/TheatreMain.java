import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreMain {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();

        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for seat A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

    }

    public static void printList(List<Theatre.Seat> list) {

        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================================");

    }

}
