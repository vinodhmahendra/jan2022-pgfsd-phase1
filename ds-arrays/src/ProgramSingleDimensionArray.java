
public class ProgramSingleDimensionArray {
	
	public static void main(String[] args) {
		SingleDimenisonArray singleDimenisonArray = 
				new SingleDimenisonArray(5);
		singleDimenisonArray.insert(0, 10);
		singleDimenisonArray.insert(3, 30);
		singleDimenisonArray.insert(4, 20);
		singleDimenisonArray.insert(1, 20);
//		singleDimenisonArray.insert(3, 300);
		singleDimenisonArray.traverseArray();
		System.out.println();
		singleDimenisonArray.searchInArray(20);
		
		singleDimenisonArray.deleteValue(4);
		singleDimenisonArray.traverseArray();
				
		
	}

}
