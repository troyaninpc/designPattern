package designPattern.state;

public class GreenState extends State {
	
	public void handle(Context context) {
		if ("green".equals(context.getColor())) {
			System.out.println("green lightened");
		} else {
			context.setState(new RedState());
			context.request();
		}
	}
	
}
