package problem2;

import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String res = convertUpperCase(s1);
		System.out.println(res);
	}
	public static String convertUpperCase(String s) {
		StringBuilder s1 = new StringBuilder();
		
		String s2[] = s.split(" ");
		for (int i = 0; i < s2.length; i++) {
			if(s2[i].length() %2 == 0) {
				s1.append(Character.toUpperCase(s2[i].charAt(0))).append(s2[i].substring(1)).append(" ");
			}else {
				int mid = (s2[i].length()+1)/2;
				s1.append(s2[i].substring(0,mid-1)).append(Character.toUpperCase(s2[i].charAt(mid-1))).append(s2[i].substring(mid)).append(" ");
			}
		}
		return s1.toString().trim();
		
	}
	

}
