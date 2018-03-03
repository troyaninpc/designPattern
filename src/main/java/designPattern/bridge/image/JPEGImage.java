package designPattern.bridge.image;

public class JPEGImage extends Image {

	@Override
	public void parseFile(String fileName) {
		Matrix matrix = new Matrix();
		display.display(matrix);
	}

}
