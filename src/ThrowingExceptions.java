import java.io.FileNotFoundException;

public class ThrowingExceptions {
	
	//declare rule
	public void readFile(String file) throws FileNotFoundException {
		boolean found = findFile(file);
		
		if ( !found ) {
			throw new FileNotFoundException("missing file");
		}else {
			//code to read file
		}
		
	}

	private boolean findFile(String file) {
		return false;
	}
}
