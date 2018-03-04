package designPattern.visitor;

public class ElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
