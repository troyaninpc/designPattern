package designPattern.mediator;

import java.util.HashMap;

public abstract class Mediator {

	protected HashMap<String, Colleague> colleagueMap = new HashMap<>();
	
	public void register(Colleague colleague) {
		colleagueMap.put(colleague.getName(), colleague);
	}
	
	public abstract void mediate(String colleague);

}
