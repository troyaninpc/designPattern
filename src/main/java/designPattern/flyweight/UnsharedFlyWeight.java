package designPattern.flyweight;

public class UnsharedFlyWeight extends FlyWeight {

	@Override
	public void operate(String extrinsic) {
		System.out.println("extrinsic: " + extrinsic);
	}

}
