import java.util.List;

public class TheatreMain {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);


        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for seat A02");
        } else {
            System.out.println("Seat already reserved");
        }

    }

    public static void printList(List<Theatre.Seat> list) {

        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================================");

    }

}
