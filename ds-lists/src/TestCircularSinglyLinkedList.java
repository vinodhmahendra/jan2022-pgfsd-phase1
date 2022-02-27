
public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {

		CircularSinglyLinkedList circularSinglyLinkedList 
		= new CircularSinglyLinkedList();

		circularSinglyLinkedList.createCSLL(7);

		circularSinglyLinkedList.insertCSLL(3, 0);
		circularSinglyLinkedList.insertCSLL(5, 2);
		circularSinglyLinkedList.insertCSLL(10, 1);

		circularSinglyLinkedList.traverseCSLL();

		var result = circularSinglyLinkedList.searchNode(12);
		System.out.println(result);

		result = circularSinglyLinkedList.searchNode(5);
		System.out.println();
		System.out.println(result);
		
		circularSinglyLinkedList.deleteNode(0);
		circularSinglyLinkedList.traverseCSLL();
		
		circularSinglyLinkedList.deleteCSLL();
		circularSinglyLinkedList.traverseCSLL();
	}

}
