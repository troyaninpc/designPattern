package designPattern.composite;

public interface Component {

	void operate(int n);

	void addChild(Component child);

	void removeChild(int n);

	Component getChild(int n);

}
