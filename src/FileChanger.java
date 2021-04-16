import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileChanger {

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
	
	
	/**
	 * Called to write to existing .txt file
	 * Only call if file is created
	 * @param info ArrayList of links and names
	 * @throws IOException
	 */
	public static void writeFile(ArrayList<String> info) throws IOException {
		FileWriter writer = new FileWriter("Data/data.txt");
		
		// loops through array
		for (String s : info) {
			// write each element to txt
			writer.write(s + System.getProperty("line.seperator"));
		}
		
		writer.close();
	}

}
