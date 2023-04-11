package datastructure;

public class UseArrayList {

	public static void main(String[] args) {

		// Create an ArrayList of type Integer
		ArrayList<Integer> myList = new ArrayList<>();

		// Add elements to the ArrayList
		myList.add(10);
		myList.add(20);
		myList.add(30);

		// Retrieve elements using for-each loop
		for(int element: myList) {
			System.out.print(element + " ");
		}
		System.out.println();

		// Retrieve elements using Iterator
		Iterator<Integer> iterator = myList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// Remove an element from the ArrayList
		myList.remove(1);

		// Retrieve elements using for-each loop
		for(int element: myList) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}