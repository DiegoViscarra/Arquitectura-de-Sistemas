package store;

public class CloathingDiscount implements DiscountCalculator{

	@Override
	public float calculateDiscount(OrderItem item) {
		float cloathingDiscount = 0;
		if (item.getQuantity() > 2) {
			cloathingDiscount = item.getProduct().getUnitPrice();
		}
		return cloathingDiscount;
	}
}
