package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine v8;
	public Car() {
		System.out.println("Car 생성자");
	}
	/*
	public void setEngine(Engine e) {
		 this.v8 = e;
		//Engine 클래스랑 여기서 연결된거같다?
	}
	 -> Autowired 붙임면서 빠이빠이
	*/
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec();
		//Engine 클래스랑 어떻게 연결된거지?
	}
	/*
	public static void main(String[] args) {
		Engine e = new Engine();
		Car c = new Car();
		c.setEngine(e);
		c.run();
		//main ~실행쓰~ 이 작업을 Spring IoC 컨테이너가 만들어줄 거다.
	}*/
}
