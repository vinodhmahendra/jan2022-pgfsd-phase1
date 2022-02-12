import java.util.*;
public class GenericArrayList {

	public static void main(String[] args) {
		List<Integer> partList = new ArrayList<>();
		
//		partList.add(new Integer(1));
//		partList.add(new Integer(2));
//		partList.add(new Integer(3));
		
		partList.add(1);
		partList.add(2);
		partList.add(3);
		partList.add(4);
		
		System.out.println("First Part: " + partList.get(0));
		partList.add(0, 5);
		
		for  (Integer partNumberObj: partList) {
			int partNumber = partNumberObj; // autoboxing
			System.out.println("Part Number: " + partNumber);
		}
		
		
//		partList.add("Bad Data"); compiler error
		
//		Iterator elements = partList.iterator();
//		while ( elements.hasNext() ) {
//			Integer partNumberObject = (Integer) (elements.next()); //error ?
//			int partNumber  = (int) partNumberObject.intValue();
//			
//			System.out.println("Part number: " + partNumber);
//		}
	}

}
