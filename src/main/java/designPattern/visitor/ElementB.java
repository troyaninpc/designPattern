package designPattern.visitor;

public class ElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
