import java.io.IOException;
import java.util.*;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
 
public class Problem3 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
 
        // Initialize the tagger
        MaxentTagger tagger = new MaxentTagger("taggers/proj.tagger");
        
        System.out.print("Enter a String to be tagged: ");
        // The sample string
        String sample = userInput.nextLine();
 
        // The tagged string
        String tagged = tagger.tagString(sample);
 
        // Output the result
        System.out.println(tagged);
    }
}