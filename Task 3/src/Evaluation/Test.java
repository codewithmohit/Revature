package Evaluation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>(5);
		l1.add(5);
		l1.add(2);
		l1.add(9);
		Collections.sort(l1);
		System.out.println(l1);
		
		l1.stream().forEach(System.out::println);
	}

}
