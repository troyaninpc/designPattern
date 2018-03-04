package designPattern.observer;

import java.util.Observer;

public class Client {

	public static void main(String[] args) {
		Observer a = new ObserverA();
		Observer b = new ObserverB();
		MyObservable subject = new MyObservable();
		subject.addObserver(a);
		subject.addObserver(b);
		subject.setState("new message");
	}
	
}
