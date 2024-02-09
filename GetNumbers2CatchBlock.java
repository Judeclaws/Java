import java.util.*;
import java.util.InputMismatchException;
public class GetNumbers2CatchBlock
 {
    public static void main(String args[]) throws InputMismatchException
	{
		Scanner stdin = new Scanner(System.in);
			try
			{
				
				System.out.print("Enter the first non-negative number: ");
				int firstNumber = stdin.nextInt();
				System.out.print("Enter the second non-negative number: ");
				int secondNumber = stdin.nextInt();
				 // System.out.println("Your Numbers are "+secondNumber+" and "+firstNumber);
				if(firstNumber<0 || secondNumber<0)
					
				{
					throw new InputMismatchException("Negative number entered!!");
				}
				else
				{
					System.out.println("Your numbers are  "   + firstNumber +   "and "   + secondNumber);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input: " + e.getMessage());
			}
		//	finally
		   // {
           // stdin.close();
           // }
	}
}