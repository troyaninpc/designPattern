package designPattern.memoto;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("original state");
		Memoto memoto = originator.createMemoto();
		Caretaker taker = new Caretaker();
		taker.setMemoto(memoto);
		
		originator.setState("changed state");
		originator.restoreMemoto(taker.getMemoto());
		System.out.println(originator.getState());
	}
	
}
