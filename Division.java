//user defined exception is extended here
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
    	try
    	{
    		
    	
		        double num1, num2;
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        num1=sc.nextDouble();
		        System.out.print("Enter the second number: ");
		        num2=sc.nextDouble();
		        
		        if(num2==0)
		        {
		        	throw new DivisionByZeroException("Division by zero not allowed") ;
		        }
    	}
	    catch(DivisionByZeroException e)
	    {
	    	String msg=e.getMessage();
	    	System.out.print(msg);
	    }
    }
}
