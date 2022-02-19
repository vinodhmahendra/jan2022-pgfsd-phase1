
public class TwoDimensionArray {
	int[][] arr = null;
	
	//delete value from array
	public void deleteValue(int row,int col) {
		try {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("the value has been deleted successfully");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array");
		}
	}
	
	public void searchingValue(int value) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] == value) {
					System.out.println("value is found at row :" + row + " Col: " + col);
					return;
				}
			}
		}
		System.out.println("value is not found!!");
	}
	
	public void accessCell(int row,int col) {
		System.out.println("\n Accessing Row# " + row + " , Col#" + col) ;
		try {
			System.out.println("cell value is: " + arr[row][col]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid  index for2D array.");
		}
	}
	
	public void insertValueInTheArray(int row,int col,int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] =value;
				System.out.println("the value is successfully inserted");
			}else {
				System.out.println("This cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index for 2D array.");
		}
	}

	public void traverse2DArray() {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}

	public TwoDimensionArray(int numberOfRows, int numberofColumns) {
		this.arr = new int[numberOfRows][numberofColumns];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}

	}

}
