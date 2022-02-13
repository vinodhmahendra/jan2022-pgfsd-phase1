import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample2 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//shared object
		SyncStack stack = new SyncStack();
		es.execute(new Producer(stack));
		es.execute(new Consumer(stack));
///		es.execute(new ExampleRunnable("one"));
//		es.execute(new ExampleRunnable("two"));
		es.shutdown();
		
		try {
			es.awaitTermination(5, TimeUnit.SECONDS);
		}catch (InterruptedException ex) {
			System.out.println("stopped waiting early");
		}
	}

}
