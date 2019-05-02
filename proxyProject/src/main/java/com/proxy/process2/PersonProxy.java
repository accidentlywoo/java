package com.proxy.process2;

public class PersonProxy implements Person {
	private Person person;
	private Before before;
	private Person getPerson;
	public void setPerson(Person person) {this.person = person;}
	public Before getBefore() {return before;}
	public void setBefore(Before before) {this.before = before;}
	
	public void doSomething() {
		//System.out.println("문을 열고 집에 들어간다..");
		if(before!=null) {
			before.before();
		}
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
