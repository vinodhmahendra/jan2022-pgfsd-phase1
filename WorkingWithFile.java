import java.io.File;
import java.io.IOException;

public class WorkingWithFile {

	public static void main(String[] args) throws IOException {
		
		File myDir = new File("MyDocs");
		
		if ( myDir.mkdir()) {
			System.out.println("the directory  is created.");
		}else {
			System.out.println("the directory is already exists");
		}
		
		File subDir = new File(myDir,"subDir");
		subDir.mkdir();
		
		File myFile = new File (myDir,"myFile.txt");
		myFile.createNewFile();
		
		myFile.renameTo(new File(myDir,"sample.txt"));
		
		File d = new File(myDir,"sample.txt");
		if ( d.delete()) {
			System.out.println(d.getName() + " Deleted ");
		}else {
			System.out.println("Failed");
		}
	}
}
