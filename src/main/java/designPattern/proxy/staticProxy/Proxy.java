package designPattern.proxy.staticProxy;

public class Proxy implements Subject {

	private Subject target;
	
	public Proxy(Subject subject) {
		this.target = subject;
	}
	
	@Override
	public void request() {
		preRequest();
		target.request();
		postRequest();
	}
	
	private void preRequest() {
		System.out.println("pre doing");
	}
	
	private void postRequest() {
		System.out.println("post doing");
	}

}
