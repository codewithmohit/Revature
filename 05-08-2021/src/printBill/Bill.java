package printBill;

public class Bill{
	private String itemName;
	private double price;
	private int quantity;
	public Bill(String itemName, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void printBill() {
		System.out.printf("  %8s %5.2f %6d %10.2f\n",itemName,price,quantity,price*quantity);
	}
	@Override
	public String toString() {
		return itemName+" "+price+ " "+quantity+"\n";
	}
}
