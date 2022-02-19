
public class SingleDimenisonArray {
	
	int arr[] = null;
	
	//delete value from array
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex] = Integer.MIN_VALUE;
			System.out.println("the value has been deleted successfully");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array");
		}
	}
	
	//search for an element in the given array
	public void searchInArray(int valueToSearch) {
		for (int i = 0 ; i < arr.length ; i++) {
			if ( arr[i] == valueToSearch) {
				System.out.println("value is found at the index of " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found!");
	}
	
	public void insert(int location,int valueToBeInserted) {
		try {
			if ( arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("successfully inserted");
			}else {
				System.out.println("this call is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index to access array!");
		}
	}
	
	
	
	public SingleDimenisonArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for ( int i = 0 ; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]  + "  ");
			}
		}catch(Exception e) {
			System.out.println("Array no longer exists!");
		}
	}

}
