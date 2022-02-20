
public class TestQueueArray {

	public static void main(String[] args) {
		QueueArray queueArray = new QueueArray(3);

		System.out.println("Is the queue empty : " + queueArray.isEmpty());
		System.out.println("Is the queue full ? " + queueArray.isFull());
		
		
		
		queueArray.enQueue(4);
		queueArray.enQueue(2);
		queueArray.enQueue(5);
//		queueArray.enQueue(1);
		
		
		System.out.println("item : " +queueArray.deQueue());
		System.out.println("Peek : "+ queueArray.peek());
		System.out.println("item : " +queueArray.deQueue());
		System.out.println("item : " +queueArray.deQueue());
		
		
		System.out.println("Is the queue full ? " + queueArray.isFull());
//		System.out.println("item : " +queueArray.deQueue());
	}

}
