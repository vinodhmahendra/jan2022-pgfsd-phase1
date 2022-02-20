import java.io.FileInputStream;
import java.io.InputStream;

public class TryCatchStatement {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("About to open a file");
			InputStream in= new FileInputStream("missingfile.txt");
			System.out.println("File Open");
		}catch (Exception e) {
			System.out.println("something went wrong!");
		}
	}

}
