
//custom excetions
public class InvalidPasswordException extends Exception{

	public InvalidPasswordException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidPasswordException(String message) {
		super (message);
	}
	
	public InvalidPasswordException(String message,Throwable cause) {
		super (message,cause);
	}
	
}
