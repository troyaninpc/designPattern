package designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import designPattern.proxy.MyOperation;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		method.invoke(target, args);
		System.out.println("after");
		return null;
	}

	public static void main(String[] args) {
		Operation oper = new MyOperation();
		InvocationHandler handler = new MyInvocationHandler(oper);
		Operation proxy = (Operation) Proxy.newProxyInstance(oper.getClass().getClassLoader(),
				oper.getClass().getInterfaces(), handler);
		proxy.operate();
	}

}
