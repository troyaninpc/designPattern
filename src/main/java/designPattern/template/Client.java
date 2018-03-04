package designPattern.template;

public class Client {

	public static void main(String[] args) {
		Template template = new Template() {
			
			@Override
			public void run() {
				System.out.println("runing...");
			}
		};
		template.work();
	}
	
}
