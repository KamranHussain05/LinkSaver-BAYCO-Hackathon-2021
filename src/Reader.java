import java.io.File;
import java.io.IOException;

public class Reader {
	
	public static Boolean checkFile() {
		Boolean isFile;
		
		try {
			File file = new File("data.txt");
			isFile = false;
		}
		
		catch (Exception e) {
			isFile = true;
		}
		
		return isFile;
	}
	
	
	
}
