
public class Program {

	public static void main(String[] args) {
		int[] arr= { 8,9,12,15,17,19,20,21,28};
//		Searching.linearSearch(arr, 20);

//		Searching.binarySearch(arr, 4);
		
		int result = Searching.expSearch(arr,arr.length,15);
		System.out.println("Element is present at index: " +  result);
		
	}

}
