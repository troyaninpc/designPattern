package designPattern.composite;

public class Client {

	public static void main(String[] args) {
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		Component root = new Composite("root");
		Component composite1 = new Composite("composite1");
		root.addChild(composite1);
		root.addChild(leaf1);
		composite1.addChild(leaf2);
		root.operate(1);
	}
	
}
