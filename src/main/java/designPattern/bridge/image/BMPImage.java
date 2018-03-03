package designPattern.bridge.image;

public class BMPImage extends Image {

	@Override
	public void parseFile(String fileName) {
		Matrix matrix = new Matrix();
		display.display(matrix);
	}

}
