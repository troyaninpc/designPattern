package designPattern.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	public void print() {
		System.out.println("EnumSingleton.INSTANCE.print();");
	}
	
}
