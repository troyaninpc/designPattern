package designPattern.proxy.staticProxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("real request");
	}

}
