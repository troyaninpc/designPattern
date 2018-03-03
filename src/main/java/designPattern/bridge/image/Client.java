package designPattern.bridge.image;

public class Client {

	public static void main(String[] args) {
		Image jpeg = new JPEGImage();
		Image bmp = new BMPImage();
		IMGDisplay windows = new WindowsDisplay();
		IMGDisplay linux = new LinuxDisplay();
		jpeg.setDisplay(windows);
		bmp.setDisplay(linux);
		jpeg.parseFile("file.jpeg");
		bmp.parseFile("file.bmp");
	}

}
