package streamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class MinimumPrice{
	
	
		public static void main(String [] args) {
			// TODO Auto-generated method stub
			List<Bus> busList = new ArrayList<>();
			busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
			busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
			busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
			busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
			busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
			busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
			busList.add(new Bus(111, "Xyz Travels", 500.22, 4.3f));
			busList.add(new Bus(111, "Xyz Travels", 1200.22, 4.3f));
			
//			List name= busList.stream()
//		               .filter(e->e.getProviderName().equals("Xyz Travels"))
//					.map(e->e.getCost()).sorted().collect(Collectors.toList());
//			System.out.println(name.get(0));
			
			double d = busList.stream()
		               .filter(e->e.getProviderName().equals("Xyz Travels"))
		               .map(e->e.getCost()).min((a,b)->a.compareTo(b)).get();
			
			System.out.println("Minimum price of Xyz Travels :"+d);
			
			// anyMatch gives returns whether any elements of this stream match the provided predicate. 
			boolean b = busList.stream().map(x->x.getProviderName()).anyMatch(x->x.matches("Jee Travels"));
			System.out.println(b);
			
			//Stream.allMatch() returns whether all elements of this stream match the provided predicate.
			b = busList.stream().allMatch(x->x.getProviderName().matches("Abc Travels"));
			System.out.println(b);
			
			System.out.println("Unique Provider Name");
			//distinct() returns a stream consisting of distinct elements in a stream
			busList.stream().map(x->x.getProviderName()).distinct().forEach(System.out::println);
			
			// Convert the Stream to Map.
			
			Map<Object, Object> res = busList.stream().map(x->x.getProviderName())
									.distinct()
									.collect(Collectors.toMap(value->value,value->value.length()));
			
			System.out.println(res);
			
		}
}