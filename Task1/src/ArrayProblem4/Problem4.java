//Take array as input remove the digits where the first value and last value is same
// * eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
// * so output will be [344,699]

package ArrayProblem4;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {101,22,344,699,552,555,253,262};
		System.out.println(Arrays.toString(ar));
		int res[] = getResult(ar);
		for (int i : res) {
			if(i!=0)
				System.out.print(i + " ");
		}
	}
	
	public static int[] getResult(int ar[]) {
		int res[] = new int[ar.length];
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if(!checkValue(ar[i]))
				res[j++] = ar[i];
		}
		return res;
	}
	
	public static boolean checkValue(int n) {
		String s = n + "";
		return s.charAt(0) == s.charAt(s.length()-1);
	}

}

// Input  : [101, 22, 344, 699, 552, 555, 253, 262]
// output : 344 699 552 253 
