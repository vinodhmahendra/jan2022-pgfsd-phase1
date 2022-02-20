
public class QueueArray {

	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	
	public void deleteQueue() {
		arr  = null;
		System.out.println("The Queue is successsfully deleted!");
	}
	
	public int peek() {
		if ( !isEmpty()) {
			return arr[beginningOfQueue];
		}else {
			System.out.println("The Queue is empty");
			return -1;
		}
	}
	
	public QueueArray(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("The Queue is succesfully created with size of: "+size);
	}
	
	public int deQueue() {
		if ( isEmpty() ) {
			System.out.println("The Queue is empty");
			return -1;
		}else {
			int result = arr[beginningOfQueue];
			beginningOfQueue++;
			if ( beginningOfQueue > topOfQueue ) {
				beginningOfQueue = topOfQueue = -1;
			}
			return result;
		}
	}

	public void enQueue(int value) {
		if ( isFull() ) {
			System.out.println("The Queue is Full!");
		}else if ( isEmpty() ) {
			beginningOfQueue =  0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted " + value+ " in the queue");
		}else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted " + value+ " in the queue");
		}
	}
	
	//is full
	public boolean isFull() {
		if ( topOfQueue == arr.length - 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
			return true;
		}else {
			return false;
		}
	}
}
