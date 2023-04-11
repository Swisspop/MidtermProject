package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {



		public static void main(String[] args) throws Exception {

			int[] num = new int[1000000];
			storeRandomNumbers(num);
			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

			// Selection Sort
			Sort algo = new Sort();
			algo.selectionSort(num);
			long selectionSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
			connectToSqlDB.insertDataFromArrayToSqlTable(algo.selectionSort(num), "selection_sort", "SortingNumbers");
			List<String> selectionSortList = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
			System.out.println("Selection Sort result: " + selectionSortList);

			// Insertion Sort
			randomize(num, num.length);
			algo.insertionSort(num);
			long insertionSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
			connectToSqlDB.insertDataFromArrayToSqlTable(algo.insertionSort(num), "insertion_sort", "SortingNumbers");
			List<String> insertionSortList = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
			System.out.println("Insertion Sort result: " + insertionSortList);

			// Bubble Sort
			randomize(num, num.length);
			algo.bubbleSort(num);
			long bubbleSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
			connectToSqlDB.insertDataFromArrayToSqlTable(algo.bubbleSort(num), "bubble_sort", "SortingNumbers");
			List<String> bubbleSortList = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
			System.out.println("Bubble Sort result: " + bubbleSortList);

			// Merge Sort
			randomize(num, num.length);
			algo.mergeSort(num);
			long mergeSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSort


	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
