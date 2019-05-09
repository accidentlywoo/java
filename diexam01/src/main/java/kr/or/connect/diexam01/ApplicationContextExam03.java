package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam03 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// Annotation 설정 방법
		
		Car car = (Car)ac.getBean(Car.class); //설정이름 상과없이 클래스로 꺼내올 수 있다.
		car.run();
	}
}
