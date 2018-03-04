package designPattern.flyweight;

public class ConcreteFlyWeight extends FlyWeight {

	private String intrinsic;

	public ConcreteFlyWeight(String intrinsic) {
		this.intrinsic = intrinsic;
	}

	@Override
	public void operate(String extrinsic) {
		System.out.println("intrinsic: " + intrinsic);
		System.out.println("extrinsic: " + extrinsic);
	}

}
