import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\trainer\\feb2022\\io-basics\\file1");
		System.out.format("Path %s exists : %b%n",path,Files.exists(path, LinkOption.NOFOLLOW_LINKS));
		
		Path createFilePath = Paths.get("D:\\trainer\\feb2022\\io-basics\\file4");
		Files.createFile(createFilePath);
		
		
	}

}
