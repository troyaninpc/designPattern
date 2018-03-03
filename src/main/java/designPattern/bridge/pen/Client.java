package designPattern.bridge.pen;

public class Client {

	public static void main(String[] args) {
		Pen big = new BigPen();
		Pen small = new SmallPen();
		ColorService red = new Red();
		ColorService blue = new Blue();
		big.setColor(red);
		small.setColor(blue);
	}

}
