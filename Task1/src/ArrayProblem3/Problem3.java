// Find all prime numbers in array

package ArrayProblem3;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};	
		int res[] = getResult(ar);
		System.out.println(Arrays.toString(ar));
		for (int i : res) {
			if(i!=0)
				System.out.print(i + " ");
		}

	}
	
	public static int[] getResult(int ar[]) {
		int res[] = new int[ar.length];
		int j=0;
		for (int i = 0; i < ar.length; i++) {
			if(checkPrime(ar[i])) {
				res[j++] = ar[i];
			}
		}
		return res;
	}
	
	public static boolean checkPrime(int a) {
		if(a == 1) {
			return false;
		}
		for (int i = 2; i <= a/2; i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}

}

// Input  : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
// Output : 2 3 5 7 11 13 17 19 
