package com.proxy.process1;

public class PersonProxy implements Person {
	private Person person;
	private Person getPerson;
	public void setPerson(Person person) {this.person = person;}
	
	public void doSomething() {
		System.out.println("문을 열고 집에 들어간다..");
		try {
			person.doSomething();
			System.out.println("잠을 잔다");
		}catch (Exception e) {
			System.out.println("비상비상!1");
		}finally{
			System.out.println("잠을 잔다");
		}
	}

}
