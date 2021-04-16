import java.io.File;
import java.io.IOException;

public class Reader {

	/**
	 * Method to run every time program starts, creates a file if there is no file, and returns true if file was present
	 * @return Boolean, if true -> file present from save, if false -> new file created
	 */
	public static Boolean checkFile() {
		Boolean isFile;
		
		try {
			File file = new File("Data/data.txt");
			isFile = false;
		}
		
		catch (Exception e) {
			isFile = true;
		}
		
		return isFile;
	}
	
	
	
}
