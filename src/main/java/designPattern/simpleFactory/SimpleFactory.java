package designPattern.simpleFactory;

public class SimpleFactory {

	public Product getProduct(int type) {
		if (type==0) {
			return new ProductA();
		}
		if (type==1) {
			return new ProductB();
		}
		return null;
	}
	
	public interface Product {};
	public static class ProductA implements Product {}
	public static class ProductB implements Product {}
	
}
