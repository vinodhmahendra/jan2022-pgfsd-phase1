
public class ExampleRunnable implements Runnable{
	
	private final String name;
	
	

	public ExampleRunnable(String name) {
		this.name = name;
	}



	@Override
	public void run() {
		System.out.println("Name: " + this.name);
		for ( int i = 0;i < 10 ; i ++) {
			System.out.println("i:"+i);
		}
	}
}
