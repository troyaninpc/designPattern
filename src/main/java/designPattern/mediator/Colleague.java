package designPattern.mediator;

public abstract class Colleague {

	private String name;

	protected Mediator mediator;

	public Colleague(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return name;
	}

	public void sendTo(String colleague) {
		mediator.mediate(colleague);
	}
	
	public abstract void doWork();
	
}
