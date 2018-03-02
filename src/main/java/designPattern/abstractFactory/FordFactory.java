package designPattern.abstractFactory;

public class FordFactory implements Factory {

	public Car makeTruck() {
		return new FordTruck();
	}

	public Car makeSUV() {
		return new FordSUV();
	}

}
