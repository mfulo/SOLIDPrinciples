package labAss5;

public class CustomerDetailImp implements CustomerDetail{

	@Override
	public void placeOrder(String customerName, String address) {
		System.out.println("Order placed for " + customerName + " at " + address);
	}
}
