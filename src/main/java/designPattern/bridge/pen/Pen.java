package designPattern.bridge.pen;

public abstract class Pen {

	protected ColorService color;
	
	public void setColor(ColorService color) {
		this.color = color;
	}

	public abstract void draw(String shape);
	
}
