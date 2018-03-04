package designPattern.mediator;

public class ColleagueB extends Colleague {

	public ColleagueB(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void doWork() {
		System.out.println("colleague B do testing");
	}
	
}
