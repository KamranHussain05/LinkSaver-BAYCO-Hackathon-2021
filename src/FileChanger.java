import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		} catch (FileNotFoundException e) {
			isFile = false;
		}

		return isFile;
	}

	/**
	 * Creates new file data.txt
	 * Only call if checkFile() returns false
	 * @return if file was successfully created
	 */
	public static void createFile() {
		try {
			File file = new File("Data/data.txt");
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Error in createFile()");
			e.printStackTrace();
		}
	}

	/**
	 * Only call if checkFile() returns true or createNewFile() returns true;
	 * 
	 * @pre Data d object needs to have 8 terms
	 * @param d
	 * @return String of file content
	 */
	public static void readFile(Data d) {
		String data = ""; // initialize String
		int num = 0;
		try {
			File file = new File("Data/data.txt");
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNextLine()) {
				data = fileReader.nextLine();
				d.replaceStrings(num, data);
				num++;
			}

			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File is not found, stacktrace: ");
			e.printStackTrace();
		}
	}

	/**
	 * Called to write to existing .txt file Only call if file is created
	 * 
	 * @param info ArrayList of links and names
	 * @throws IOException
	 */
	public static void writeFile(ArrayList<String> info) throws IOException {
		FileWriter writer = new FileWriter("Data/data.txt");
		
		// loops through array
		for (String s : info) {
			// write each element to txt
			writer.write(s + "\n");
		}

		writer.close();
	}
	
	/**
	 * Overloaded function with line number to write
	 * @param info
	 * @throws IOException
	 */
//	public static void writeFile(ArrayList<String> info, int lineNum) throws IOException {
//		FileWriter writer = new FileWriter("Data/data.txt");
//		BufferedReader reader = new BufferedReader(new FileReader("Data/data.txt"));
//		
//		String oldContent = "";
//		
//		// reads old content
//		String line = reader.readLine();
//        while (line != null) {
//            oldContent = oldContent + line + System.lineSeparator();
//             
//            line = reader.readLine();
//        }
//        
//        reader.close();
//        
//        BufferedReader lineReader = new BufferedReader(new FileReader("Data/data.txt"));
//        
//        for (int i = 0; i < lineNum; i++) {
//            lineReader.readLine();
//        }
//
//        String oldString = lineReader.readLine();
//        String newString = "";
//        
//        // loops through arrayList
//     	for (String s : info) {
//   			// write each element to newString
//   			newString += s; 
//   		}        
//        
//        String newContent = oldContent.replaceAll(oldString, newString);
//		
//		writer.write(newContent);
//
//		writer.close();
//	}

}
