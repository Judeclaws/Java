import java.util.Scanner;
import java.util.InputMismatchException;
public class InputMismatchExceptionDemo {
	public static void main(String[]args)
	{
		Scanner keyboard= new Scanner(System.in);
		int number=0;
		boolean done= false;
			while(!done)
			{
				try
				{
					System.out.println("Enter a whole number: ");
					number=keyboard.nextInt();
					done=true;
				}
				catch(InputMismatchException e)
				{
					keyboard.nextLine();
					System.out.println("Not a correctly written whole number!!");
					System.out.println("Try Again!!");
				}
			}
			System.out.println("You entered "  +number);
	}
}