package designPattern.state;

public class RedState extends State {
	
	public void handle(Context context) {
		if ("red".equals(context.getColor())) {
			System.out.println("red lightened");
		} else {
			context.setState(new YellowState());
			context.request();
		}
	}
	
}
