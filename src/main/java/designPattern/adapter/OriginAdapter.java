package designPattern.adapter;

public class OriginAdapter implements NewFunction {

	private Origin origin;
	
	public OriginAdapter(Origin origin) {
		this.origin = origin;
	}
	
	public void newFunction() {
		System.out.println("transform to new function");
		this.origin.oldFunction();
	}

}
