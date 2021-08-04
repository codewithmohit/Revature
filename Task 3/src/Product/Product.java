package Product;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double cost;
	private int quantity;
	private float rating;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double cost, int quantity, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", Product Name= "+name+
				", cost= "+cost+", quantity= "+quantity + ", rating= "+rating+"]";
	}
	
	@Override
	public int compareTo(Product p) {
		Integer p1 = this.id;
		Integer p2 = p.id;
		return p1.compareTo(p2);
	}
	
}
