import java.io.*;
import java.util.*;
/**
 * This class is a FileProcessor object and was modified to handle
 * exceptions.
 * @author Fanni Kertesz
 * @version 2.0
 * Lab 4
 * CS131-01
 *
 */

public class FileProcessor
{

	private String fileName;//variable stores file name
	private int stringLength;//variable stores string length that throws exception
	private ArrayList<String> stringList;//variable stores an ArrayList of strings
	private Scanner input;//input scanner for file
	
	/*
	 * preferred constructor for the FileProcessor object
	 * @param fileName - name of file to process
	 * @param stringLength - length of string that throws exception
	 */
	public FileProcessor(String fileName, int stringLength)
	{
		this.fileName = fileName;
		if(stringLength < 5)
			this.stringLength = 5;
		else
			this.stringLength = stringLength;
		
	}//end preferred-argument constructor
	
	/*
	 * @return name of file
	 */
	public String getFileName()
	{
		return fileName;
	}//end getFileName
	
	/*
	 * @return length of string
	 */
	public int getStringLength()
	{
		return stringLength;
	}//end getStirngLength
	
	/*
	 * @param fileName - name of new file to be processed
	 */
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}//end setFileName
	
	/*
	 * @param stringLength - new length of string
	 */
	public void setStringLength(int stringLength)
	{
		this.stringLength = stringLength;
	}//end setStringLength
	
	/*
	 * @return size of ArrayList of strings
	 */
	public int getArrayListSize()
	{
		return stringList.size();
	}//end getArrayListSize
	
	/*
	 * method processes some files and throws/catches exceptions
	 */
	public void processFile() //throws FileNotFoundException
	{
		//new StringTooLongException object with message
		StringTooLongException e2 = new StringTooLongException("At least one word is too long in the file.");
		
		try
		{
			input = new Scanner(new File(fileName));//scanner for file
			
			while(input.hasNextLine())
			{
				if(input.nextLine().length() > stringLength)//processes each line
					throw e2;//throws StringTooLongException if applicable
					
			}
			
			input.close();
		}//end try
		
		/*catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}*/
		
		//catches exceptions where a string is too long
		catch(StringTooLongException e)
		{
			System.out.println(e.getMessage());
		}//end catch
		
		//catches exceptions where the file cannot be found
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}//end catch
		
	}//end processFile
}//end class
