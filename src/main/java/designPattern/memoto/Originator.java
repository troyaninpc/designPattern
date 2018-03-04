package designPattern.memoto;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memoto createMemoto() {
		return new Memoto(this);
	}
	
	public void restoreMemoto(Memoto memoto) {
		this.state = memoto.getState();
	}
	
}
