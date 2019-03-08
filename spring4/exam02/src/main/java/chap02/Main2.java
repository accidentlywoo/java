package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g1 = ctx.getBean("greeter",Greeter.class);
		Greeter g2 = ctx.getBean("greeter",Greeter.class);
		System.out.println("(g1 == g2)="+(g1==g2));
		ctx.close();
		/*
		 * 스프링은 별도의 설정을 하지 않을 경우 한 개의 빈 객체를 생성하며, 이들 빈 객체들이'싱글톤'범위를 갖는다 표현
		 * 싱글톤은 단일 객체를 의미하는 단어, 스프링은 기본적으로 한개의 <bean>태그에 대해 한개의 빈 객체를 생성한다.
		 */
	}
}
