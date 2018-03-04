package designPattern.visitor;

public class ConcreteVisitor extends Visitor {

	@Override
	public void visit(ElementA a) {
		a.doWork();
	}

	@Override
	public void visit(ElementB b) {
		b.doWork();
	}

}
