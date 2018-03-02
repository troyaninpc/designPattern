package designPattern.factoryMethod;

public class FactoryB implements Factory {

	public Product getProduct() {
		return new ProductB();
	}

	public static class ProductB implements Product {

		@Override
		public String toString() {
			return "ProductB";
		}
		
	}
}
