package designPattern.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void operate() {
		System.out.println("some operation");
	}

}
