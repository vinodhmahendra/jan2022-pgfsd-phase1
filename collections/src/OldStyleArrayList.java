import java.util.*;
public class OldStyleArrayList {

	public static void main(String[] args) {
		List partList = new ArrayList();
		
		partList.add(new Integer(1));
		partList.add(new Integer(2));
		partList.add(new Integer(3));
		partList.add("oops a string!");
		
		Iterator elements = partList.iterator();
		while ( elements.hasNext() ) {
			Integer partNumberObject = (Integer) (elements.next()); //error ?
			int partNumber  = (int) partNumberObject.intValue();
			
			System.out.println("Part number: " + partNumber);
		}
	}

}
