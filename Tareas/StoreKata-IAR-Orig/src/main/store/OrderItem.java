package store;

public class OrderItem {
	
	private Product product;
	private int quantity;

	/*
	 * Order Item Constructor
	 */
	public OrderItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	float calculateTotalFor(OrderItem item) {
		float totalItem=0;
		if (getProduct().getCategory() == ProductCategory.Accessories) {
			
		}
		if (getProduct().getCategory() == ProductCategory.Bikes) {
			
		}
		if (getProduct().getCategory() == ProductCategory.Cloathing) {
	
		}
		
		return totalItem;
	}

	private float calculateTotalAmount() {
		float itemAmount = getProduct().getUnitPrice() * getQuantity();
		return itemAmount;
	}
}
