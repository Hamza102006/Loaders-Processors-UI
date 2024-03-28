import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Hamza Khan
 * 9/20/2023
 */
public class PersonalInfoUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		String fileName = null;
		String input [], output;

		try {
			//ask the user for the file name 
			fileName = JOptionPane.showInputDialog(null, "Enter a file name");

			input = Loader.loadFile(fileName); //loads the information from the file into input 

			//loop through the input array and process each entry 
			String text = "";

			for (int i= 0; i < input.length; i++) {
				//call the processing method from the processor class
				output = PersonalInfoProcessor.processInformation(input[i]);
				text = text + output + "\n\n";
			}

			//setup a JTextArea to display the information 
			JTextArea outputArea = new JTextArea();
			outputArea.setText(text);
			outputArea.setEditable(false);
			JOptionPane.showMessageDialog(null,outputArea);
		}
		
		//catch all potential error 
		catch (FileNotFoundException error) {
			JOptionPane.showMessageDialog(null, fileName + " Not Found!");
		}
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, fileName + " is corrupted!");

		}
		catch (Exception error) {
			JOptionPane.showMessageDialog(null, fileName + " Unknown Error!");

		}


	}

}
