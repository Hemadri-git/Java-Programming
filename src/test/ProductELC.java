package test;

public class ProductELC {

	public static void main(String[] args) {
		
		Product product = new Product(1, "dairymilk", 35);
		
		for(int i = 1; i<=5; i++) {
		
			product.getProductObject();
			System.out.println(product);
		}
		
		
	}
}
