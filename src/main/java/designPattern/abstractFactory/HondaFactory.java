package designPattern.abstractFactory;

public class HondaFactory implements Factory {

	public Car makeTruck() {
		return new HondaTruck();
	}

	public Car makeSUV() {
		return new HondaSUV();
	}

}
