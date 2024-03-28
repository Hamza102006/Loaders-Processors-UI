/**
 * 
 */

/**
 * @author Hamza
 * Date; 9/19/2023
 * Desc: Class process a string array and converts it to a String that can be displayed by a UI
 */
public class PersonalInfoProcessor {
	
	
	/**
	 * METHOD TO PROCESS THE STRING AND FORMAT IT
	 * TO LAST NAME, FIRST NAME, AGE and GENDER
	 */

	public static String processInformation(String myString) {
		String fName = null;      //declare and init variables for the first name 
		String lName = null;      // last name, first name, age , gender
		int age = 0;
		char gender = 0;
		
		//split the input String into words. Use  space as the delimiter
		String [] words = myString.split(" ");
		
		//for loop to take the items from the array into my variables 
		
		for (int i = 0; i < words.length; i++) {
		
			//switch based in which word 
			
			switch(i) {
			
			case 0:{
				fName = words[0];
				break;
			}

			case 1:{
				lName = words[1];
				break;

			}

			case 2:{
				age = Integer.parseInt(words[2]);
				break;

			}

			case 3:{
				gender = words[3].charAt(0);


			}
			
			
		} //end of the switch 
			
		} //end of the for loop 
		
		// call the convertGender Method
		String genderType = convertGender(gender);
		
		String formattedInfo = "Name:\t"
				+ lName.concat(", ").concat(fName).concat("\n")
				+ "Age:\t" + age + "\n" +
				"Gender:\t" + genderType; // you can call the convertGender here as well
		
		return formattedInfo;
		
	}
	
	
	/**
	 * METHOD TO CONVERT GENDER CHAR TO A GENDER AS A STRING 
	 */
	
	public static String convertGender (char gender) {
		//variable for the gender string
		String genderStr = null;
		
		//convert to String gender based on a gender char 
		
		switch (gender) {
		
		case 'm' :{
			genderStr = "Male";
			break;
			
		}
		
		case 'f': {
			genderStr = "Female";
			break;
		}
		
		default:{
			genderStr = "Other";
			
		}
		}
		return genderStr;
		
	}
	
	
	
	/**
	 *  Self TESTING MAIN METHOD 
	 */
	public static void main(String[] args) {
		// Declare 2 Arrays 
		String input [] = new String [3];
		String output [] = new String [3];
		
		//specify different phrases to test 
		input [0] = "Darth Vader 50 m";
		input [1] = "Princess Leia 30 f";
		input [2] = "R2D2 Droid 150 x";
		
		//loop through pharses and covert them 
		for (int i = 0; i < input.length; i++) {
			output [i] = PersonalInfoProcessor.processInformation(input[i]);
			System.out.println(output[i]);
			
		}
		
	}

}
