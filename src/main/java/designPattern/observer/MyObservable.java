package designPattern.observer;

import java.util.Observable;

public class MyObservable extends Observable {

	private String state;

	public void setState(String state) {
		this.state = state;
		this.setChanged();
		this.notifyObservers(state);
	}

}
