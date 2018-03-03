package designPattern.prototype;

public class Prototype implements Cloneable {

	public Prototype Clone() throws Exception {
		return (Prototype)super.clone();
	}
	
}
