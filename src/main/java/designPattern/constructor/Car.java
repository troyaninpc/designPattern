package designPattern.constructor;

public class Car {

	private String wheel;
	
	private String body;
	
	private String engine;

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", body=" + body + ", engine=" + engine + "]";
	}
	
}
