// Take an array and remove all duplicates in it

package ArrayProblem1;

import java.util.Arrays;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[]= {12,33,11,23,4,11,12,11,12,11,12};
		System.out.println(Arrays.toString(ar1));
		removeDuplicate(ar1);
	}
	public static void removeDuplicate(int ar1[]) {
		Arrays.sort(ar1);
		int ar2[] = new int[ar1.length];
		ar2[0]=	ar1[0];
	    int j=0;
		for (int i = 0; i < ar1.length; i++) {
			if(ar1[i]!=ar2[j]) 
				ar2[++j] = ar1[i];
		}
		for (int i = 0; i <= j; i++) {
			System.out.print(ar2[i]+" ");
		}
	}

}


// Input  : [12, 33, 11, 23, 4, 11, 12, 11, 12, 11, 12]
// Output : 4 11 12 23 33 