import java.util.Scanner;

public class Flightt {
    private boolean seats[];

    public Flightt() {
        seats = new boolean[10];
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
        } else 
        {
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
        Flightt twaFlight = new Flightt();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Available Seats");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

          switch (choice) 
            {
                case 1:
                    twaFlight.displayAvailableSeats();
                    break;
                case 2:
                    System.out.print("Enter the seat number you want to reserve: ");
                    int seatToReserve = scanner.nextInt();
                    twaFlight.reserveSeat(seatToReserve);
                    break;
                case 3:
                    System.out.print("Enter the seat number you want to cancel reservation for: ");
                    int seatToCancel = scanner.nextInt();
                    twaFlight.cancelReservation(seatToCancel);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } 
      while (choice != 4);

        scanner.close();
    }
}
