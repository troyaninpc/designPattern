package designPattern.constructor;

public class HondaBuilder extends Builder {

	@Override
	public void buildWheel() {
		car.setWheel("Honda wheel");
	}

	@Override
	public void buildBody() {
		car.setBody("Honda body");
	}

	@Override
	public void buildEngine() {
		car.setEngine("Honda engine");
	}

}
