package Product;

import java.util.Comparator;

public class ProductCostComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1,Product p2) {
		Double d1 = p1.getCost();
		Double d2 = p2.getCost();
		return d2.compareTo(d1);
	}

}
