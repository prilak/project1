package assignment1;


// At most n


import java.util.Scanner;
import java.util.*;

public class Problem1 {			
		private static final int CHAR_TO_INT = 96;

		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        //System.out.println("Enter number of adjacent values: ");
				int numAdjacent = userInput.nextInt();

				userInput.nextLine(); //skips nextLine character

        //System.out.println("Enter a String of numbers: ");
				String numString = userInput.nextLine();
				
				//System.out.println("Enter a String of words");
				//String words = userInput.nextLine();

        largestProduct(numAdjacent, numString);
        //oneDollarWords(words);
        //System.out.println("Hello, World");
    }


		private static long product(int[] queue, int size) {
			long result = queue[0];
			for (int i = 1; i < size; i++) { // finds the prodct of a queue of ints
				if (queue[i]!=0) {
					result *= queue[i];
				}
			}
			return result;
		}


		private static void refreshQueue(int[] queue, int size) {
			int placeHolder = queue[0];
			// System.out.println("begin");
			for (int i = size - 2; i >= 0; i--) { //bumps queue values up by one i.e. queue[1] = queue[0]
				//placeHolder = queue[i + 1];
				queue[i + 1] = queue[i];
				//queue[i + 1] = placeholder;
				// System.out.println(queue[i]);
			}
			//System.out.println("done");
		}


    private static long largestProduct(int numAdjacent, String numString) {
    	long productMax = 0;
    	//System.out.println(numAdjacent + ", " + numString);
    	int[] queue = new int[numAdjacent];
    	//System.out.println(intQueue[0]);
    	
    	//ask about strings with < n adjacent
    	
    	
			for (int i = 0; i < numString.length(); i++) {
				char value = numString.charAt(i); //Integer.parseInt(numString[i]);
				queue[0] = Character.getNumericValue(value);
				long product = product(queue, numAdjacent);
				if(product > productMax) {
					
					productMax = product;
				}
				// System.out.println(product);
				refreshQueue(queue, numAdjacent);
			}
    	//System.out.print("Enter the name: \n");
    	System.out.println(productMax);
    	return productMax;

    }
}
	

