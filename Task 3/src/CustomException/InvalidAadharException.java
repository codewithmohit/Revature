package CustomException;

public class InvalidAadharException extends Exception {
	
	public InvalidAadharException() {
		super();
	}
	
	public InvalidAadharException(String message) {
		super(message);
	}
}
