package mypack;

import sort.QuickSort;

public class Main {

	public static void main(String[] args) {
		int[] array = {10,3,2,5,8,4,6,1,9,7};

		QuickSort.quickSort(array, 0, array.length-1);
		QuickSort.printArray(array);
		
//		MergeSort.mergeSort(array, 0, array.length-1);
//		MergeSort.printArray(array);
		
//		SelectionSort.selectionSort(array);
//		BubbleSort.bubbleSort(array);
		
//		InsertionSort.insertionSort(array);
//		
//		InsertionSort.printArray(array);
	}

}
