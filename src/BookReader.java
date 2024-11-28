import java.io.*;
import java.util.*;

public class BookReader {
    public static void main(String[] args) {
        // Path to the book file
        String filePath = "book.txt";

        // HashMap to store words and their counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line till there is nothing to read(null)
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); // Split by non-word characters

                for (String word : words) {
                    if (word.isEmpty()) 
                        continue;

                    // Update the count in the HashMap
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }



        // // Print the HashMap contents (not arranged in alphabetical order)

        // wordCount.forEach((word, count) -> 
        //     System.out.println(word + ": " + count)
        // );



                                //print arranged words content using treemap 

        TreeMap<String, Integer> sortedMap = new TreeMap<>(wordCount);

        // Print the sorted output
        System.out.println("Words in alphabetical order:");
        sortedMap.forEach((word, count) -> 
            System.out.println(word + ": " + count)
        );









        
                            ////find the length of a word in the book
                            // // Word to search for

        // String targetWord = "through";

        // // Check if the word exists in the HashMap
        // if (wordCount.containsKey(targetWord)) {
        //     int repetitionCount = wordCount.get(targetWord);
        //     System.out.println("The word \"" + targetWord + "\" is repeated " + repetitionCount + " times.");
        // } else {
        //     System.out.println("The word \"" + targetWord + "\" is not in the text.");
        // }
        
    }
}
