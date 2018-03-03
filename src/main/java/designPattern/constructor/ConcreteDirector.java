package designPattern.constructor;

public class ConcreteDirector {

	public Car construct(Builder builder) {
		builder.buildBody();
		builder.buildWheel();
		builder.buildEngine();
		return builder.createCar();
	}
	
	public static void main(String[] args) {
		Builder ford = new FordBuilder();
		Builder honda = new HondaBuilder();
		ConcreteDirector director = new ConcreteDirector();
		Car fordCard = director.construct(ford);
		Car hondaCard = director.construct(honda);
		System.out.println(fordCard);
		System.out.println(hondaCard);
	}
	
}
