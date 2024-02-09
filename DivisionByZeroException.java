//user defined exception
public class DivisionByZeroException extends Exception{

    public DivisionByZeroException() {
    	super("Division by zero");
    }
    public DivisionByZeroException(String message){
    	super(message);
    }
    
}