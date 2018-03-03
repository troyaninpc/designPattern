package designPattern.bridge.image;

public abstract class Image {

	protected IMGDisplay display;
	
	public void setDisplay(IMGDisplay display) {
		this.display = display;
	}

	public abstract void parseFile(String fileName);
	
}
