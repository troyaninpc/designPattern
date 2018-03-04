package designPattern.state;

public class Context {

	private State state;

	private String color;

	public void setState(State state) {
		this.state = state;
	}

	public void request() {
		state.handle(this);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Context context = new Context();
		context.setColor("red");
		State state = new YellowState();
		context.setState(state);
		context.request();
	}

}
