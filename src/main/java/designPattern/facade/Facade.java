package designPattern.facade;

public class Facade {

	private FunctionA functionA;
	private FunctionB functionB;
	
	public Facade() {
		functionA = new FunctionA();
		functionB = new FunctionB();
	}

	public void funtion() {
		functionA.a();
		functionB.b();
	}
	
}
