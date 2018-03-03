package designPattern.constructor;

public class FordBuilder extends Builder {

	@Override
	public void buildWheel() {
		car.setWheel("Ford wheel");
	}

	@Override
	public void buildBody() {
		car.setBody("Ford body");
	}

	@Override
	public void buildEngine() {
		car.setEngine("Ford engine");
	}

}
