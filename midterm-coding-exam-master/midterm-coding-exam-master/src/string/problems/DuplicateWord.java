package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Convert the string to lowercase to make the comparison case-insensitive
        st = st.toLowerCase();

        // Split the string into words using space and period as delimiters
        String[] words = st.split("[ .]");

        // Create a HashMap to store each word and its frequency
        Map<String, Integer> wordFrequency = new HashMap<String, Integer>();

        // Calculate the total length of all words
        int totalLength = 0;

        // Loop through each word in the array
        for (String word : words) {

            // If the word is already in the map, increment its frequency
            if (wordFrequency.containsKey(word)) {
                int count = wordFrequency.get(word);
                wordFrequency.put(word, count + 1);
            }

            // Otherwise, add the word to the map with a frequency of 1
            else {
                wordFrequency.put(word, 1);
            }

            // Add the length of the word to the total length
            totalLength += word.length();
        }

        // Calculate the average length of the words
        double averageLength = (double) totalLength / words.length;

        // Print the duplicate words and their frequencies
        System.out.println("Duplicate words and their frequencies:");
        for (String word : wordFrequency.keySet()) {
            int count = wordFrequency.get(word);
            if (count > 1) {
                System.out.println(word + ": " + count);
            }
        }

        // Print the average length of the words
        System.out.println("Average length of the words: " + averageLength);
    }

}