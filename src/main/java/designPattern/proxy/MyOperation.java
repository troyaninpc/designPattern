package designPattern.proxy;

import designPattern.proxy.dynamicProxy.Operation;

public class MyOperation implements Operation {

	@Override
	public void operate() {
		System.out.println("my operation");
	}

}
