package labAss5;

public class OrderDetailImp implements OrderDetail{

	@Override
	public void calculateTotal(double price, int quantity) {
		double total = price * quantity;
        System.out.println("Order total: ₱" + total);
	}
}
