import java.util.Arrays;




public class Searching {


	
	public static int expSearch(int[] arr, int length, int value) {
		//  if value is at position one
		if ( arr[0] == value) {
			return 0;
		}
		
		// find the range for the binary search
		int i = 1;
		while ( i < length && arr[i] <= value) {
			i = i * 2;
		}
		
		//now call the binary search
		return Arrays.binarySearch(arr, (i/2),Math.min(i, length),value);
	}

	public static int binarySearch(int arr[] ,int value) {
		int start = 0;
		int end = arr.length -1;
		int middle = ( start + end) / 2;
		
//		System.out.println(start + " " + middle + " " + end);
		
		while (arr[middle] != value && start <= end ) {
			if ( value < arr[middle]) {
				end = middle -1 ;
			}else {
				start = middle + 1;
			}
			
			middle =  (start + end) / 2;
			
//			System.out.println(start + " " + middle + " " + end);
		
		}

		if ( arr[middle] == value ) {
			System.out.println("the element is found at the index: " + middle);
			return middle;
		}else {
			System.out.println("The element " + value + " not found.");
			return -1;
		}
		

	}
	
	
//	 8, 9, 12, 15, 17,19,20,21,28
//	 S             M            E
//	 S      M   E
//	        SM  E
	
	public static int linearSearch(int arr[], int value) {
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] == value) {
				System.out.println("The element is found at the index : " + i);
				return i;
			}
		}
		System.out.println("The element " + value + " not found");
		return -1;
	}


	
	
}
