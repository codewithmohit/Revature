// In every word if it is not palindrome then reverse it 
// and print back the whole sentence. 

package problem3;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = getResult(s);
		System.out.println(res);
	}
	
	public static String getResult(String s) {
		
		StringBuilder sc = new StringBuilder();
		
		String s1[] = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			sc.append(new StringBuilder(s1[i]).reverse()).append(" ");
//			if(checkPalindrome(s1[i])) {
//				sc.append(s1[i]).append(" ");
//			}else {
//				sc.append(new StringBuilder(s1[i]).reverse()).append(" ");
//			}
		}
		return sc.toString().trim();
	}
	
//	public static boolean checkPalindrome(String s) {
//		StringBuilder s1 = new StringBuilder(s);
//		s1.reverse();
//		if(s1.toString().equals(s)) {
//			return true;
//		}
//		return false;
//	}
}

// Input  : mohit jindal how are you lol
// Output : tihom ladnij woh era uoy lol
