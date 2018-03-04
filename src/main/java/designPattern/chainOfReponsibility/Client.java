package designPattern.chainOfReponsibility;

public class Client {

	public static void main(String[] args) {
		Handler handlerA = new ConcreteHandlerA(); 
		Handler handlerB = new ConcreteHandlerB();
		handlerA.setSussessor(handlerB);
		handlerA.handle("B");
	}
	
}
