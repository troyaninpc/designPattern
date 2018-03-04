package designPattern.chainOfReponsibility;

public class ConcreteHandlerA extends Handler {

	@Override
	public void handle(String condition) {
		if("A".equals(condition)) {
			System.out.println("handled by A");
		} else {
			sussessor.handle(condition);
		}
	}

}
