package com.proxy.process2;

public class Test {
	public static void main(String[] args) {
		Person boy = new Boy();
		Person girl = new Girl();
		PersonProxy proxy = new PersonProxy();
		
		proxy.setBefore(new BeforeImp());
		proxy.setPerson(boy);
		proxy.doSomething();
	}
}
