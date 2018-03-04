package designPattern.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void operate() {
		super.operate();
		System.out.println("enhanced operation");
	}

	
	
}
