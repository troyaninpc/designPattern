package designPattern.singleton;

public class StaticSingleton {
	
	private StaticSingleton() {
		
	}
	
	private static StaticSingleton instance = new StaticSingleton();
	
	public static StaticSingleton getInstance() {
		return StaticSingleton.instance;
	}

}
