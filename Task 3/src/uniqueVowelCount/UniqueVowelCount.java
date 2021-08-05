package uniqueVowelCount;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Arrays;

public class UniqueVowelCount {

	public static void main(String[] args) {
		//  2)Same as task1 but you should only count unique vowel 
		//count i.e if a word is having aeeeeee like that so that count of vowel is 2 not 8
		String s="Hii i am here for you aeeeee unique";
		System.out.println(hello(s));
	}
	public static String hello(String s) {
		String[] ar=s.split(" ");
		Arrays.sort(ar);
		Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
		for(String w:ar) {
			int c = countUniqueVowel(w);
			
			if(map.containsKey(c)) {
				String temp=map.get(c);
				temp=w+" "+temp;
				map.put(c, temp);
			}else {
				map.put(c, w);
			}
		}
		System.out.println("map: "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer,String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}
	
	public static int countUniqueVowel(String s) {
		int count=0;
		s.toLowerCase();
		if(s.contains("a")) {
			count++;
		}
		if(s.contains("e")) {
			count++;
		}
		if(s.contains("i")) {
			count++;
		}
		if(s.contains("o")) {
			count++;
		}
		if(s.contains("u")) {
			count++;
		}
		return count;
	}
	
	}

