    //          Task 2 - Calculate total and print bill.
	//          Item Name          Price    Qty.    Line Total
	//          Line Total = Price * Qty.
	//          Bill Total = Total of Line Total + 5% tax;
	//          Items needs to be sorted based on Item Name.

package printBill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class PrintBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bill> billList = new ArrayList<>();
		billList.add(new Bill("Dahi",50,10));
		billList.add(new Bill("Mango Juice",40,2));
		billList.add(new Bill("Pizza",510,6));
		billList.add(new Bill("Ice-Cream",210,9));
		
		System.out.println("\n\n *********PinkCity Hotel********\n");
		System.out.println("  ItemName  "+"Price    "+"Qty  "+"LineTotal  ");
		
		for (Bill bill : billList) {
			bill.printBill();
		}
		
		
		
		double totalBill =billList.stream().map(x->x.getPrice()*x.getQuantity()).reduce(0.0,(sum,number)->sum+number);
		System.out.println("                      Total= "+ totalBill);
		System.out.println("                           .........");
		System.out.println("                  BillTotal= "+totalBill*1.05+"\n "
				+ "          (Inclusive of 5% tax)");
		
	}

}
