// Find all the palindrome numbers in array

package ArrayProblem2;

import java.util.Arrays;

public class Problem2 {
	public static void main(String[] args) {
		int arr[] = {11,266,252,345,365,545,261,242};
		System.out.println(Arrays.toString(arr));
		int ar1[] = getResult(arr);
		for (int i : ar1) {
			if(i!=0)
			System.out.print(i+" ");
		}
	}
	
	public static int[] getResult(int arr[]) {
		int res[] = new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(checkPalindrome(arr[i])) {
				res[j++] = arr[i];
			}
		}
		return res;
	}
	
	public static boolean checkPalindrome(int a) {
		String s = a+"";
		StringBuilder s1 = new StringBuilder(s);
		return s1.reverse().toString().equals(s);
	}
}

// Input  : [11, 266, 252, 345, 365, 545, 261, 242]
// Output : 11 252 545 242 