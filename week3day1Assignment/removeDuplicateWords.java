package week3day1Assignment;

public class removeDuplicateWords {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        int count = 0;

        // Split the text into words
        String[] words = text.split(" ");

        // Compare each word with every other word
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Case-insensitive comparison for duplicates
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = " ";  // Replace duplicate with empty string
                    count++;
                }
            }
        }

        // If duplicates found, print the modified array
        if (count > 0) {
            // Loop through the words array using index
            for (int i = 0; i < words.length; i++) {
                String word = words[i];  // Access the current word by index
                
                // Check if the current word is not an empty string
                if (!word.isEmpty()) {
                    // Print the word followed by a space
                    System.out.print(word + " ");
                } else {
                    // If the word is empty (duplicate), print two spaces to keep output formatting consistent
                    System.out.print("  ");
                }
            }
        }

      }
        
    }

