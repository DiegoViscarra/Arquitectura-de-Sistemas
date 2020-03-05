package store;

public class BikesDiscount implements DiscountCalculator{

	@Override
	public float calculateDiscount(OrderItem item) {
		float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
		return itemAmount - itemAmount * 20 / 100;
	}

}
