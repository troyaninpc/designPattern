package designPattern.composite;

public class Leaf implements Component {

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	public void operate(int n) {
		System.out.println(name + "'s operation");
	}

	public void addChild(Component child) {
		System.out.println("can't do this");
	}

	public void removeChild(int n) {
		System.out.println("can't do this");
	}

	public Component getChild(int n) {
		System.out.println("can't do this");
		return null;
	}

}
