package designPattern.chainOfReponsibility;

public abstract class Handler {
	
	protected Handler sussessor;
	
	public void setSussessor(Handler sussessor) {
		this.sussessor = sussessor;
	}

	public abstract void handle(String condition);

}
