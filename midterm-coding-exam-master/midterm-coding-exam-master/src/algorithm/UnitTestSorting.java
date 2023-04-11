package algorithm;

import org.junit.Assert;

public class UnitTestSorting {

    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        //Create Sort object
        Sort sort = new Sort();

        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);

        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Test bubbleSort
        int[] bubbleSortArray = {6, 9, 2, 5, 1, 0, 4};
        sort.bubbleSort(bubbleSortArray);
        try {
            Assert.assertEquals(sortedArray, bubbleSortArray);
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Test insertionSort
        int[] insertionSortArray = {6, 9, 2, 5, 1, 0, 4};
        sort.insertionSort(insertionSortArray);
        try {
            Assert.assertEquals(sortedArray, insertionSortArray);
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Test mergeSort
        int[] mergeSortArray = {6, 9, 2, 5, 1, 0, 4};
        sort.mergeSort(mergeSortArray);
        try {
            Assert.assertEquals(sortedArray, mergeSortArray);
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Test quickSort
        int[] quickSortArray = {6, 9, 2, 5, 1, 0, 4};
        sort.quickSort(quickSortArray);
        try {
            Assert.assertEquals(sortedArray, quickSortArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
