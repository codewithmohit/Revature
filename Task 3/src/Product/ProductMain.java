package Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(100,"Oil",1000,5,4.2f));
		productList.add(new Product(109,"Laptop",2000,2,3.6f));
		productList.add(new Product(200,"Mouse",1500,4,4.9f));
		productList.add(new Product(165,"Keyboard",1600,1,4.2f));
		productList.add(new Product(255,"Mobile",9500,2,3.2f));
		
		printProductList(productList);
		
		Collections.sort(productList);
		System.out.println("\nPrinting Product sorted based on id");
		printProductList(productList);
		
		Collections.sort(productList,new ProductNameComparator());
		System.out.println("\nPrinting Product sorted based on name");
		printProductList(productList);
		
		Collections.sort(productList,new ProductCostComparator());
		System.out.println("\nPrinting Product sorted based on Cost");
		printProductList(productList);
		
		Collections.sort(productList,(Product p1,Product p2)->{
			Float f1= p1.getRating();
			Float f2 = p2.getRating();
			int x = f2.compareTo(f1);
			if(x==0) {
				Double i1 = p1.getCost();
				Double i2 = p2.getCost();
				x = i2.compareTo(i1);
			}
			return x;
		});
		System.out.println("\nPrinting Product sorted based on Rating");
		printProductList(productList);
		
		Collections.sort(productList,(Product p1,Product p2)->{
			Integer i1= p1.getQuantity();
			Integer i2 = p2.getQuantity();
			return i2.compareTo(i1);
		});
		System.out.println("\nPrinting Product sorted based on Quantity");
		printProductList(productList);
		
	}
	
	public static void printProductList(List<Product> productList) {
		for (Product product : productList) {
			System.out.println(product);
		}
	}

}
