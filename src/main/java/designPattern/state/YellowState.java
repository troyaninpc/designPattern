package designPattern.state;

public class YellowState extends State {
	
	public void handle(Context context) {
		if ("yellow".equals(context.getColor())) {
			System.out.println("yellow lightened");
		} else {
			context.setState(new GreenState());
			context.request();
		}
	}
	
}
