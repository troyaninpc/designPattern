package designPattern.bridge.image;

public class WindowsDisplay implements IMGDisplay {

	public void display(Matrix matrix) {
		System.out.println("windows display image");
	}

}
