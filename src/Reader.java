import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Reader {

	/**
	 * Method to run every time program starts, creates a file if there is no file,
	 * and returns true if file was present
	 * 
	 * @return Boolean, if true -> file present from save, if false -> new file
	 *         created
	 */
	public static Boolean checkFile() {
		Boolean isFile;

		try {
			File file = new File("Data/data.txt");
			Scanner fileReader = new Scanner(file);
			isFile = true;
		} 
		catch (FileNotFoundException e) {
			isFile = false;
		}

		return isFile;
	}

	/**
	 * Called if checkFile returns true
	 * 
	 * @return String of file content
	 */
	public static String readFile() {
		String data = ""; // initialize String
		
		try {
			File file = new File("Data/data.txt");
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNextLine()) {
				data = fileReader.nextLine();
			}

			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File is not found, stacktrace: ");
			e.printStackTrace();
		}
		
		return data;
	}

}
