package problem1;

import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		String res = convertLastCharacter(s1);
		System.out.println(res);
		
	}
	
	public static String convertLastCharacter(String s1) {
		String s2[] = s1.split(" ");
		
		StringBuffer s3 = new StringBuffer();
		for (int i = 0; i < s2.length; i++) {
			int j = s2[i].length() -1;
			s3.append(s2[i].substring(0,j)).append(Character.toUpperCase(s2[i].charAt(j))).append(" ");
		}
		return s3.toString().trim();
	}

}
