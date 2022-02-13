
public class SharedValue {
	
	//potentially shared variable
	private int i;
	
	public int getNext() {
		return i++;
	}

}

// i : 0, i: 0 ,i :1
