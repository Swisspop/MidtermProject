package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		// Text file to read
		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		// BufferedReader to read the file
		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {

			// LinkedList and Stack to store words
			LinkedList<String> linkedList = new LinkedList<>();
			Stack<String> stack = new Stack<>();

			// Read file line by line
			String line;
			while ((line = br.readLine()) != null) {
				// Split each line into words
				String[] words = line.split("\\s+");
				// Add each word to LinkedList and Stack
				for (String word : words) {
					linkedList.addLast(word);
					stack.push(word);
				}
			}

			// Demonstrate the use of Stack methods
			System.out.println("Peeking at the top element of the Stack: " + stack.peek());
			System.out.println("Searching for the index of the word 'self': " + stack.search("self"));
			System.out.println("Popping the top element of the Stack: " + stack.pop());

			// Iterate through the LinkedList using For Each loop
			System.out.println("\nRetrieving words from the LinkedList as FIFO order:");
			for (String word : linkedList) {
				System.out.print(word + " ");
			}

			// Iterate through the Stack using while loop and Iterator
			System.out.println("\n\nRetrieving words from the Stack as FILO order:");
			while (!stack.empty()) {
				System.out.print(stack.pop() + " ");
			}

		} catch (Exception e) {
			// Handle any exception that might occur while reading the file
			System.out.println("Error: " + e.getMessage());
		}
		    String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
	}

}
