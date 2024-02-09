
import java.util.Scanner;
public class Largest

{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	public void big(a,b,c)
	{
		if(a>b)
		{
			if(a>c)
			{
				return a;
			}
			else
			{
				return c;
			}
		}
        else
        {
        
			if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
       }	
	}
	System.out.println("Largest is A= ");
	a=nextInt();
	System.out.println("Largest is B= ");
	b=nextInt();
	System.out.println("Largest is C= ");
    c=nextInt();
    
big(a,b,c);    
}