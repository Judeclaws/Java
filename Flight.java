
public class Flight 
 {
      private boolean seats[];
      
    public Flight() 
	    {
	    	seats=new boolean[10];
	    }
    public void displayAvailableSeats()
    {
    	System.out.println("Available Seats:");
    	
    	for(int i=0;i<seats.length;i++)
    	{
    		if(!seats[i])
    		{
    			System.out.print("Seats"+(i+1)+"");
    		}
    	}
    	System.out.println();
    }
    public void reserveSeat(int seatNumber)
    {
    	if(seatNumber>=1 && seatNumber<=seats.length && !seats[seatNumber-1])
    	{
    		seats[seatNumber-1]=true;
    		System.out.println("Seat"+seatNumber+"Reserved Succesfully");
    	}
    	else
    	{
    		System.out.println("Invlid Seat Number");
    	}
    	
    }
    public void cancelReservation(int seatNumber)
    {
    	if(seatNumber>=1 && seatNumber<=seats.length && seats[seatNumber-1])
    	{
    		seats[seatNumber-1]=false;
    			System.out.println("Reservation for seat"+seatNumber+"Canceled Succesfully");
    			
    	}
    	else
    	{
    		System.out.println("Invalid Seat Number");
    	}
    }
    public static void main (String[] args) 
    {
    	Flight twaFlight=new Flight();
    	
    	twaFlight.displayAvailableSeats();
    	twaFlight.reserveSeat(3);
    	twaFlight.reserveSeat(7);
    	
    	twaFlight.displayAvailableSeats();
    	
    	twaFlight.cancelReservation(3);
    	
    	twaFlight.displayAvailableSeats();
    }
    
}