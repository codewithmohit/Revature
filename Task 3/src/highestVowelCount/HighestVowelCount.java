//1)Arrange the sentence by words with the word which is 
// having highest vowel count first and followed by rest, if two
//or more words have same vowel count then arrange it reverse alphabetical order

package highestVowelCount;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HighestVowelCount {

	public static void main(String[] args) {
		 
		String s="Hii Hello i love to do code and practicing my skill over there";
		System.out.println(hello(s));
	}
	public static String hello(String s) {
		String[] ar=s.split(" ");

		Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
		for(String w:ar) {
			//int length=w.length();
			int n = countVowel(w);
			if(map.containsKey(n)) {
				String temp=map.get(n);
				temp=w+" "+temp;
				map.put(n, temp);
				
			}else {
				map.put(n, w);
			}
		}
		System.out.println("map: "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer,String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}
	public static int countVowel(String s) {
		int count=0;
		s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') 
				count++;
		}
		return count;
	}
}
// Input : "Hii Hello i love to do code and practicing my skill over there"
//   
// Output : 
//   map: {3=practicing, 2=there over love code Hii Hello, 1=to skill i do and, 0=my}
//   practicing there over love code Hii Hello to skill i do and my
