package designPattern.strategy;

public class Context {

	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void algorithm() {
		strategy.algorithm();
	}
	
	public static void main(String[] args) {
		Strategy strategy = new StrategyA();
		Context context = new Context();
		context.setStrategy(strategy);
		context.algorithm();
	}
	
}
