package com.proxy.process1;

public class Test {
	public static void main(String[] args) {
		Person boy = new Boy();
		Person girl = new Girl();
		PersonProxy proxy = new PersonProxy();
		
		proxy.setPerson(boy);
		proxy.doSomething();
	}
}
