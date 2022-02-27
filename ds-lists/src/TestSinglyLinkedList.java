
public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = 
				new SinglyLinkedList();
		
		singlyLinkedList.createSinglyLinkedList(7);
		
		singlyLinkedList.insertInLinkedList(5, 0);
		singlyLinkedList.insertInLinkedList(10, 8);
		
		singlyLinkedList.insertInLinkedList(20, 6);
		
		singlyLinkedList.insertInLinkedList(30, 1);
		
		singlyLinkedList.insertInLinkedList(60, 4);
		
		singlyLinkedList.traverseSinglyLinkedList();
	}

}
