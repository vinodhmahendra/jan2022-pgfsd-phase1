
public class SinglyLinkedList {

	public void insertInLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;

		if (head == null) {
			createSinglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node tempNode = head;
			int index = 0;
			//finding the location
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}

		size++;
	}

	public void traverseSinglyLinkedList() {
		if (head == null) {
			System.out.println("SLL does not exist!");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("\n");
	}

	public Node head;
	public Node tail;

	public int size;

	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		tail = new Node();

		Node node = new Node();
		node.value = nodeValue;
		node.next = null;

		head = node;
		tail = node;

		size = 1;

		return head;

	}

}
