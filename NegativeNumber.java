//driver program for NegativeNumberException
import java.util.*;
public class NegativeNumber {

    public static void main(String[]args)
    {
    	Scanner sc=new Scanner(System.in);
    	int num;
    	try
    		{

						    	System.out.printf("Enter a positive number:");
						    	num=sc.nextInt();
						    	if(num<0)
						    	{
						    		throw new NegativeNumberException("Negative number not allowed!!");
						    	}
						    	else
						    	{
						    		System.out.println("Positive number "+num+ " was entered");
						    	}
    		}
    		catch(NegativeNumberException e)
    		{
    			System.out.println("Invalid number: " +e.getMessage());
    		}
						    	
    }
    
    
}