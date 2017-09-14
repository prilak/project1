import java.util.Scanner;
import java.util.*;

public class HelloWorld {			

	static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Enter number of adjacent values: ");
				int numAdjacent = userInput.nextInt();

				userInput.nextLine(); //skips nextLine character

        System.out.println("Enter a String of numbers: ");
				String numString = userInput.nextLine();
		
        largestProduct(numAdjacent, numString);
        //System.out.println("Hello, World");
    }


		private static int product(int[] queue, int size) {
			int result = queue[0];
			for (int i = 1; i < size; i++) { // finds the prodct of a queue of ints
				result *= queue[i];
			}
			return result;
		}


		private static void refreshQueue(int[] queue, int size) {
			//int placeHolder = queue[0];
			for (int i = 1; i < size; i++) { //bumps queue values up by one i.e. queue[1] = queue[0]
				queue[i] = queue[i - 1];
			}
		}


    private static int largestProduct(int numAdjacent, String numString) {
    	int productMax = 0;
    	System.out.println(numAdjacent + ", " + numString);
    	int[] queue = new int[numAdjacent];
    	//System.out.println(intQueue[0]);
			for (int i = 0; i < numString.length(); i++) {
				char value = numString.charAt(i); //Integer.parseInt(numString[i]);
				queue[0] = Character.getNumericValue(value);
				int product = product(queue, numAdjacent);
				if(product > productMax) {
					productMax = product;
				}
				refreshQueue(queue, numAdjacent);
			}
    	//System.out.print("Enter the name: \n");
    	System.out.println(productMax);
    	return productMax;

    }

}


