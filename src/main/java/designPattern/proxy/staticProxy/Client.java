package designPattern.proxy.staticProxy;

public class Client {

	public static void main(String[] args) {
		Subject real = new RealSubject();
		Subject proxy = new Proxy(real);
		proxy.request();
	}
	
}
