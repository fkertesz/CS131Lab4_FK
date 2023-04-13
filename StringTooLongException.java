/**
 * This class defines the StringTooLongException object extending the
 * Exception class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 4
 * CS131-01
 *
 */

public class StringTooLongException extends Exception
{
	/*
	 * preferred-argument constructor using the superclass
	 * @param message that the exception may print out
	 */
	public StringTooLongException(String message)
	{
		super(message);
	}//end preferred-constructor
}//end class