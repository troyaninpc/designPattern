package designPattern.template;

public abstract class Template {

	public void prepare() {
		System.out.println("prepare something");
	}
	
	public abstract void run();
	
	public void work() {
		prepare();
		run();
	}
	
}
