package designPattern.chainOfReponsibility;

public class ConcreteHandlerB extends Handler {

	@Override
	public void handle(String condition) {
		if("B".equals(condition)) {
			System.out.println("handled by B");
		} else {
			sussessor.handle(condition);
		}
	}

}
