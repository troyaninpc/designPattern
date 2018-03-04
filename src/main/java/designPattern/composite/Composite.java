package designPattern.composite;

import java.util.ArrayList;

public class Composite implements Component {

	private String name;
	
	public Composite(String name) {
		this.name = name;
	}
	
	private ArrayList<Component> children = new ArrayList<>();
	
	public void operate(int n) {
		System.out.println(name + "'s operation");
		for (Component component : children) {
			component.operate(n);
		}
	}

	public void addChild(Component child) {
		children.add(child);
	}

	public void removeChild(int n) {
		children.remove(n);
	}

	public Component getChild(int n) {
		return children.get(n);
	}

}
