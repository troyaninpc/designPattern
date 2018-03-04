package designPattern.visitor;

public abstract class Element {

	public abstract void accept(Visitor visitor);
	
	public void doWork() {
		System.out.println(this.getClass().getName());
	}
	
}
