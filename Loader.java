import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Hamza Khan
 *Date: 15 Sept
 *Desc: Class to access data files with a number of records
 *      Contains methods to read and write 
 */
public class Loader {
	
	
	/*
	 * Method to open and read from the file 
	 * Given the file name 
	 */
	
	public static String [] loadFile (String fileName) throws IOException {
		//open the file in fileName to read 
		FileReader fr = new FileReader(fileName);
		BufferedReader input = new BufferedReader (fr);
		
		// read the size of my dataset
		int size = Integer.parseInt(input.readLine());
		
		//declare and create and array for the data set 
		String fileInfo [] = new String [size];
		
		//loop through the file and save the data in the array 
		for (int i = 0; i < size; i++) {
			fileInfo [i] = input.readLine();
		}
	
		//close the file input stream
		
		input.close();
		
		// return the data back to the classer 
		return fileInfo;
		
		
	}

	
	public static void main(String[] args) throws IOException{
		// SELF TESING MAIN METHOD
		
		//Declare an array to read into
		String output[];
		
		// call the loaderfie method
		output = Loader.loadFile("PersonalInfo.dat");

		//display the contents of the output message
		
		for (int i = 0 ; i < output.length; i++) {
			System.out.println(output[i]);
		}
		

	}

}
