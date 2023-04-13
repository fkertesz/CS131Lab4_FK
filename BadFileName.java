import java.io.FileNotFoundException;
/**
 * This class tests the FileNotFoundException handling.
 * @author Fanni Kertesz
 * @version 2.0
 * Lab 4
 * CS131-01
 *
 */
public class BadFileName{
  
  public static void main(String[] args) throws FileNotFoundException
  {
    
    FileProcessor fp = new FileProcessor("String1.txt",10);
		fp.processFile();
  }//end main
  
}//end class