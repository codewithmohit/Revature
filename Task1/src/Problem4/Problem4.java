// Given a right angle triangle with sides a, b and c. 
// As per Pythagoras theorem the hypotenuse side c can be calculated 
// as square root of a square plus b square. Write a program to 
// compute the hypotenuse, when a and b are provided.

package Problem4;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Side a : ");
		int a = sc.nextInt();
		System.out.println(" Enter Side b : ");
		int b = sc.nextInt();
		int c = getHypotenuse(a,b);
		System.out.println("Hypotenuse of this Trangle : " +c);
	}
	
	public static int getHypotenuse(int a,int b) {
		return (int)Math.sqrt(a*a + b*b);
	}
}

// Input  : sides 3,4
// output : Hypotenuse of this Trangle : 5