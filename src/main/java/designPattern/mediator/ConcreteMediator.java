package designPattern.mediator;

public class ConcreteMediator extends Mediator {

	public void mediate(String colleague) {
		colleagueMap.get(colleague).doWork();
	}

}
