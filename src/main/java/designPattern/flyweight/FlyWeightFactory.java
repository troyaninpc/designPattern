package designPattern.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {

	private FlyWeightFactory() {

	}

	private static FlyWeightFactory instance = new FlyWeightFactory();

	private HashMap<String, FlyWeight> pool = new HashMap<>();

	public FlyWeightFactory getInstance() {
		return instance;
	}

	public FlyWeight getFlyWeight(String key) {
		if (pool.containsKey(key)) {
			return pool.get(key);
		}
		FlyWeight value = new ConcreteFlyWeight("concreteFlyWeight");
		pool.put(key, value);
		return value;
	}

}
