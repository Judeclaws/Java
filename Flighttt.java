import java.util.Scanner;
public class Flighttt 
{


private boolean seats[];

public Flighttt()
{
    seats=new boolean[10];
}

public void displayAvailableSeats()
{
System.out.println("Available Seats:");

for(int i=0; i < seats.length;i++)
{
    if (seats[i]) 
    {
        System.out.println("Seat: "+(i+1)+" ");
    }
}
}
public void displayReservedSeats(int seatNumber)
{
   if (seatNumber >= 1 && seats <= seats.length && !seats[seatNumber-1]) 
   {
    
   }
   else
   {

   }
}
public void displayCancelledSeats(int seatNumber)
{
    if (seatNumber >= 1 && seats<=seats.length && !seats[seatNumber-1])
    {
        
    }
    else
    {

    }
}
public static void main(String[] args) 
{
    Flighttt twaFlight=new Flighttt();
    Scanner sc=new Scanner(System.in);
     
    int choice; 
    do
    {
    System.out.println("Menu:");
    System.out.println("1.Available Seats: ");
    System.out.println("2.Reserve Seat: ");
    System.out.println("3.Cancel Seat: ");
    System.out.println("4.Exit: ");

    switch (choice) 
    {
        case 1:
            twaFlight.displayAvailableSeats();
            break;
        case 2:
             System.out.println("Enter the number of Seat you want to reserve");
             int seatToReserve=sc.nextInt();
            twaFlight.displayReservedSeats(seatToReserve);
            break;
        case 3:
            System.out.println("Enter the seat Number you want to cancel Reservation For: ");
            int seatToCancel=sc.nextInt();
            twaFlight.displayCancelledSeats(seatToCancel);
            break;
    
        default:
        System.out.println("Invalid choice Enter a valid choice between 1 and 4");
            break;
    }
    }
    while (choice!=4);
    {
       sc.close();
    }
    
 }
}
