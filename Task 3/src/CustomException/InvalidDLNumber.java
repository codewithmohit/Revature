package CustomException;

public class InvalidDLNumber extends RuntimeException{
	
	public InvalidDLNumber() {
		super();
	}
	public InvalidDLNumber(String message) {
		super(message);
	}

}
