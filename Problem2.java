package assignment1;
// Ask whether or not main needs to be the function or some
// other name following input parameters
// check .



import java.util.*;
public class Problem2 {
	private static final int CHAR_TO_INT = 96;
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// System.out.println("Enter a String of words");
		String words = userInput.nextLine();
		oneDollarWords(words);
	}
	
	private static boolean isPartWord(char value) {
    	return Character.isLetter(value) || value == '\'';
    }
	
		//private static
	private static void oneDollarWords(String paragraph) {
		for(int i = 0; i < paragraph.length(); i++) {
			int startI = i;
			int endI = startI;
			int sum = 0;
			//ArrayList<char> word = new ArrayList<char>();
			while (i < paragraph.length() && isPartWord(paragraph.charAt(i))) { // loops through each word
				char value = paragraph.charAt(i);
				if(Character.isLetter(value)) {
					char lowerCase = Character.toLowerCase(value);
					int numValue = (int) lowerCase - CHAR_TO_INT;
					sum += numValue;
				}
				endI++;
				i++;
			}
			// System.out.println(sum);
			// System.out.println(paragraph.substring(startI, endI));
			if (sum == 100) {
				System.out.println(paragraph.substring(startI, endI));
			}
		}
	}
}			
