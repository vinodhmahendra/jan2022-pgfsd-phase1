import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchStatement3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("About to open a file");
			InputStream in= new FileInputStream("missingfile.txt");
			System.out.println("File Open");
			
			int data = in.read();
			in.close();
		}catch (FileNotFoundException e) {
			System.out.println(e.getClass().getName()); //TYpe
			System.out.println("Quitting");
		}catch(IOException e) {
			System.out.println(e.getClass().getName()); //TYpe
			System.out.println("Quitting");
		}
	}

}
