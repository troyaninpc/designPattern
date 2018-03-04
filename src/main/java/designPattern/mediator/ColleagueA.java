package designPattern.mediator;

public class ColleagueA extends Colleague {

	public ColleagueA(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void doWork() {
		System.out.println("colleague A do coding");
	}
	
}
