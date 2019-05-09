package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("초시화 완료!");
		
		UserBean userBean = (UserBean) ac.getBean("userBean");
		userBean.setName("Woo");
		
		System.out.println(userBean.getName());
		
		UserBean userBean2 = (UserBean) ac.getBean("userBean");
		
		if(userBean == userBean2)
			System.out.println("같은 인스턴스입니다.");
		// 싱글톤 패턴으로 Bean을 생성한다.
	}
}
