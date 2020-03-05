package store;

public class AccessoriesDiscount implements DiscountCalculator{

	@Override
	public float calculateDiscount(OrderItem item) {
		float booksDiscount = 0;
		float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
		if (itemAmount >= 100) {
			booksDiscount = itemAmount * 10 / 100;
		}
		return booksDiscount;
	}
	
}
