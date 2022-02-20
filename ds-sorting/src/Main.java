
public class Main {

	public static void main(String[] args) {
		int[] array = {10,3,2,5,8,4,1,9};
//		SelectionSort.selectionSort(array);
//		BubbleSort.bubbleSort(array);
		
		InsertionSort.insertionSort(array);
		
		InsertionSort.printArray(array);
	}

}
