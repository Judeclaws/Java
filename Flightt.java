import java.util.Scanner;

public class Flightt {
    private boolean seats[];

    public Flightt() {
        seats = new boolean[10];
        System.out.print("Inside Constructor");
        System.out.print(seats[0]);
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");

        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print("Seat " + (i + 1) + " ");
            }
        }
        System.out.println();
    }

    public void reserveSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seats.length && !seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " Reserved Successfully");
        } else {
            System.out.println("Invalid Seat Number or Seat already reserved");
        }
    }

    public void cancelReservation(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seats.length && seats[seatNumber - 1]) {
            seats[seatNumber - 1] = false;
            System.out.println("Reservation for seat " + seatNumber + " Canceled Successfully");
        } else {
            System.out.println("Invalid Seat Number or Seat not reserved");
        }
    }

    public static void main(String[] args) {
        Flight twaFlight = new Flight();
        Scanner scanner = new Scanner(System.in);

        twaFlight.displayAvailableSeats();

        // Ask the user to select a seat to reserve
        System.out.print("Enter the seat number you want to reserve: ");
        int seatToReserve = scanner.nextInt();
        twaFlight.reserveSeat(seatToReserve);

        twaFlight.displayAvailableSeats();

        // Ask the user to select a seat to cancel reservation
        System.out.print("Enter the seat number you want to cancel reservation for: ");
        int seatToCancel = scanner.nextInt();
        twaFlight.cancelReservation(seatToCancel);

        twaFlight.displayAvailableSeats();

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
