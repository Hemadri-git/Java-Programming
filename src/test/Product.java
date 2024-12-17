package test;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public Product getProductObject() {
		
		
		
		Product product = new Product(productId, productName, productPrice);
		
		
		return product;
		
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
	

}
