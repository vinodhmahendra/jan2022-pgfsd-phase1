
public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList =
				new DoublyLinkedList();
		
		doublyLinkedList.createDLL(5);
		
		doublyLinkedList.insertDLL(10, 0);
		doublyLinkedList.insertDLL(20, 2);
		doublyLinkedList.insertDLL(30, 1);
		
		doublyLinkedList.traverseDLL();
		doublyLinkedList.reverseTraverseDLL();
		
		doublyLinkedList.searchNode(20);
		
		
		doublyLinkedList.deleteNodeDLL(2);
		doublyLinkedList.traverseDLL();
		
		doublyLinkedList.deleteDLL();
		doublyLinkedList.traverseDLL();
		
	}

}
