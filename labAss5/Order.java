package labAss5;

public class Order implements OrderDetail, CustomerDetail, Shop{
	private OrderDetail orderDetail;
	private CustomerDetail customerDetail;
	private Shop shop;
	
	public Order() {
        this.orderDetail = new OrderDetailImp();
        this.customerDetail = new CustomerDetailImp();
        this.shop = new ShopImp();
    }
	@Override
	public void generateInvoice(String fileName) {
		shop.generateInvoice(fileName);
		
	}

	@Override
	public void sendEmailNotification(String email) {
		shop.sendEmailNotification(email);
		
	}

	@Override
	public void placeOrder(String customerName, String address) {
		 customerDetail.placeOrder(customerName, address);
		
	}

	@Override
	public void calculateTotal(double price, int quantity) {
		orderDetail.calculateTotal(price, quantity);
		
	}

}
