package CustomException;

public class BusinessLayer {

	public boolean isValidAadharCard(String s) throws InvalidAadharException,NullPointerException{
		if(s==null) 
			throw new InvalidAadharException("Aadhar Card Number is not null");
		
		if( !s.matches("[0-9]{12}"))
			throw new InvalidAadharException("Aadhar Card is not Valid");
		return true;
	}
	
	public boolean isVaildEmail(String s) throws InvalidEmailException{
		if (s.matches("[a-z]{1}[a-z0-9]{4,20}@[a-z]{3,6}.com")) 
			return true;
		else {
			throw new InvalidEmailException("Email is not Valid");
		}
	}
	
	public boolean isValidPassword(String s) throws InvalidPasswordException{
		if(s.matches("[a-zA-Z0-9]{6,}"))
			return true;
		else {
			throw new InvalidPasswordException("Password is Invalid");
		}
	}
	
	public boolean isValidDLNumber(String s) {
		if(s.matches("[A-Z]{2}-[0-9]{13}"))
			return true;
		else {
			throw new InvalidDLNumber("Driving License Number Is Invalid");
		}
	}
 }
