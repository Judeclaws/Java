public class DiskDriveNotReadyException extends Exception
{
    public DiskDriveNotReadyException() 
    {
    	super("Disk Drive is not ready");
    }
    public DiskDriveNotReadyException(String message)
{
	super(message);
}
}