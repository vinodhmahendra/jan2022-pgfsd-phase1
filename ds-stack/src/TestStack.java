
public class TestStack {

	public static void main(String[] args) {
		
		Stack stack = new Stack(3);
		
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(7);
		
		System.out.println("Peek " + stack.peek());
		System.out.println("Popped : " +stack.pop());
		System.out.println("Popped : " +stack.pop());
		System.out.println("stack is empty : " +stack.isEmpty());
		System.out.println("stack is full : " + stack.isFull());

		
	}

}
