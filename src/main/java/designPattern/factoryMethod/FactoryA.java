package designPattern.factoryMethod;

public class FactoryA implements Factory {

	public Product getProduct() {
		return new ProductA();
	}

	public static class ProductA implements Product {

		@Override
		public String toString() {
			return "ProductA";
		}
		
	}
}
