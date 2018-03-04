package designPattern.memoto;

public class Memoto {

	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memoto(Originator originator) {
		this.state = originator.getState();
	}
	
}
