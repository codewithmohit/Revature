package CustomException;

public class PresentationLayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLayer b = new BusinessLayer();
		try {
		if(b.isValidAadharCard("016521400000"))
			System.out.println("Valid Aadhar Card");
		}
		catch(InvalidAadharException e) {
			System.out.println(e);
		}
		
		try {
			if(b.isVaildEmail("jindalmohit2018@gmail.com"))
				System.out.println("Valid Email Id");
		}catch(InvalidEmailException e) {
			System.out.println(e);
		}
		
		try {
			if(b.isVaildEmail("jindalmohit2018@gmail.com."))
				System.out.println("Valid Email Id");
		}catch(InvalidEmailException e) {
			System.out.println(e);
		}
		
		try {
			if(b.isValidPassword("mohit2301"))
				System.out.println("Valid Password");
		}catch(InvalidPasswordException e) {
			System.out.println(e);
		}
		try {
			if(b.isValidPassword("m301"))
				System.out.println("Valid Password");
		}catch(InvalidPasswordException e) {
			System.out.println(e);
		}
		
		try {
			if(b.isValidDLNumber("DL-0020123012546")) 
				System.out.println("Valid Driving Licence");
		}catch(InvalidDLNumber e) {
			System.out.println(e);
		}
		try {
			if(b.isValidDLNumber("DL-002dss23012546")) 
				System.out.println("Valid Driving Licence");
		}catch(InvalidDLNumber e) {
			System.out.println(e);
		}
	
	}
}
