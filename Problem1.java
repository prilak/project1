 /* Student Name: Michael Lawrence,  Lab Section: T 2-3:30 */

package assignment1;



import java.util.Scanner;
import java.util.*;

public class Problem1 {			
		private static final int CHAR_TO_INT = 96;

		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args) {
				int numAdjacent = userInput.nextInt();

				userInput.nextLine(); //skips nextLine character

				String numString = userInput.nextLine();
				
			
        largestProduct(numAdjacent, numString);
       
    }


		private static long product(int[] queue, int size) {
			long result = queue[0];
			for (int i = 1; i < size; i++) { // finds the prodct of a queue of ints
				result *= queue[i];
			}
			return result;
		}


		private static void refreshQueue(int[] queue, int size) {
			int placeHolder = queue[0];
			for (int i = size - 2; i >= 0; i--) { //bumps queue values up by one i.e. queue[1] = queue[0]
				queue[i + 1] = queue[i];
				
			}
		}


    private static long largestProduct(int numAdjacent, String numString) {
    	long productMax = 0;
    	int[] queue = new int[numAdjacent];

			for (int i = 0; i < numString.length(); i++) {
				char value = numString.charAt(i); //Integer.parseInt(numString[i]);
				queue[0] = Character.getNumericValue(value);
				long product = product(queue, numAdjacent);
				if(product > productMax) {
					
					productMax = product;
				}
				refreshQueue(queue, numAdjacent);
			}
    	System.out.println(productMax);
    	return productMax;

    }
}
	

