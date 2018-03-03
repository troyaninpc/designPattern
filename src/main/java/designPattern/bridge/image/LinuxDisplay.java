package designPattern.bridge.image;

public class LinuxDisplay implements IMGDisplay {

	public void display(Matrix matrix) {
		System.out.println("Linux display image");
	}

}
