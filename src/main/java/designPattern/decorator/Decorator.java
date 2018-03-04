package designPattern.decorator;

public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operate() {
		component.operate();
	}

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(component);
		decorator.operate();
	}
	
}
