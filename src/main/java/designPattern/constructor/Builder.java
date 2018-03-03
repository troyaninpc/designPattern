package designPattern.constructor;

public abstract class Builder {
	
	protected Car car = new Car();
	
	public abstract void buildWheel();
	
	public abstract void buildBody();
	
	public abstract void buildEngine();
	
	public Car createCar() {
		return this.car;
	}
	
}
