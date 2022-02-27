package sort;

public class QuickSort {
	
	
	public static void findBiggestNumber (int[] sampleArray) {
		
		var biggestNumber = sampleArray[0];
		
		for ( int index = 1; index < sampleArray.length ; index++) {
			
			if ( sampleArray[index] > biggestNumber ) {
				
				biggestNumber = sampleArray[index];
			
			}
		}
		System.out.println(biggestNumber);
	}
	
	static int partition(int[] array, int start , int end) {
		int pivot = end;
		int i = start -1;
		for ( int j = start ; j <= end ; j++) {
			if ( array[j] <= array[pivot] ) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
 			}
		}
		return i;
	}
	
	public static void quickSort(int[] array,int start,int end) {
		if ( start < end ) {
			int pivot = partition(array, start, end);
			quickSort(array,start,pivot-1);
			quickSort(array, pivot+1, end);
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

}
