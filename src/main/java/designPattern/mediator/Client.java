package designPattern.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague a = new ColleagueA("A", mediator);
		Colleague b = new ColleagueB("B", mediator);
		mediator.register(a);
		mediator.register(b);
		a.sendTo("B");
		System.out.println("————————————————");
		b.sendTo("A");
	}
	
}
