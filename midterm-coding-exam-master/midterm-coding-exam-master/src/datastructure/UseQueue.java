package datastructure;

public class UseQueue {

	public static void main(String[] args) {
		// Create a Queue of Strings
		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue using add() method
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");

		// Retrieve the first element in the queue using peek() method
		String first = queue.peek();
		System.out.println("First element in the queue: " + first);

		// Remove the first element from the queue using remove() method
		String removed = queue.remove();
		System.out.println("Removed element from the queue: " + removed);

		// Retrieve and remove the first element from the queue using poll() method
		String polled = queue.poll();
		System.out.println("Polled element from the queue: " + polled);

		// Iterate over the queue using a for-each loop
		System.out.println("Iterating over the queue using for-each loop:");
		for (String element : queue) {
			System.out.println(element);
		}

		// Iterate over the queue using a while loop with an iterator
		System.out.println("Iterating over the queue using while loop with iterator:");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}