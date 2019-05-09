package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 설정 JDK 5부터 사용가능
public class ApplicationConfig {
	@Bean //메서드 기존적으로 싱글톤으로 관리해준다.
	public Car car(Engine e) {
		Car c = new Car();
		//c.setEngine(e);
		return c;
		//파라미터가 없는 Bean 셍성메서드를 먼저 다 실해애서 반환받는 객체를 관리한다.
		//그리고 나서 파라미터에 생성된 객체들과 같은 타입이 있는 객체가 있을 경우에
		//파라미터로 전달해서 객체를 생성한다.
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
}
