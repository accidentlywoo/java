package com.pda.controller;

import org.springframework.util.StringUtils;

import com.sun.media.jfxmedia.logging.Logger;

public class exam {
	//부정확한 null 조건 비교는 NullPointException을 일으킬 수 있다.
	// BAD Ex)
	public String bar1(String string) {
		if(string != null || string.equals(""))
			//null여부는 체크하지만 ""와 같은지는 체크하지 않음
			return string;
		
		if(string == null&&string.equals(""))
			//String이 null일 경우 equals()를 사용하면서 NPE 발생
			return string;
		
		/*
		 * 조건식1 && 조건식2 : 조건식1이 false이면, 조건식2를 건너뜀
		 * 조건식1 || 조건식2 : 조건식 1이 true이면, 조건식2를 건너뜀
		 */
		else
			return string;
	}
	
	// GOOD Ex)
	public String bar2(String string) {
		//정확한 조건사용
		if(string !=null && !string.equals(""))
			return string;
		if(string == null||string.equals(""))
			return string;
		else
			return string;
	} 
	
	//StringUtils.isEmpty 또는 StringUtils.isBlank 이용
	public String bar3(String string) {
		if(!StringUtils.isEmpty(string))
			return string;
		//if(!StringUtils.isBlank(string))
		//	return string;
		else
			return string;
	}
	//잘못된 위치의 null조건 비교
	//부적절한 위치에서 null조건을 비교하여 NullPointException을 일으킬 수 있다.
	// BAD Ex)
	String a,b;
	public class Foo{
		void bar() {
			if(a.equals(b)&& a==null) {}//NPE 발생
		}
	}
	public class Foo1{
		void bar() {
			if(a.equals(b)|| a==null) {}//NPE 발생
		}
	}
	// GOOD Ex) - NULL체크 우선
	public class Foo2{
		void bar() {
			if(a!=null&&a.equals(b)) {}
		}
	}
	public class Foo3{
		void bar() {
			if(a==null||a.equals(b)) {}
		}
	}
	//equals()로 null비교  - equals메소드로 null을 비교하지 않는다
	
	class Bar{
		void foo() {
			String x = "foo";
			//BAD Ex)
			if(x.equals(null)) {
				//doSomthing();
			}
			//GOOD Ex)
			if(x!=null && x.equals("")) {
				//doSomthing();
			}
		}
	}
	//로그 출력 목적으로 system.out.println을 사용하지 말고 로거를 사용
	//system.out.println()을 사용하면 로그 레벨을 조정한다거나, 로그를 켜고
	//끄는 등의 로그 정책을 세울 수 없다.
	class Loo{
		public void testA() {
			//BAD Ex)
			System.out.println("Entering test");
			//GOOD Ex)
			//Logger.INFO("Entering test");
		}
	}
	// 메소드를 사용하여  로그 메시지를 출력하지 않는다. 대신 별도의 로거를 사용하여 메시지를 확인하도록 한다.
	//나쁜 예
	class Foo4 {
	  void bar() {
	    try {
	      // do something
	    } catch (Exception e) {
	        e.printStackTrace(); // printStackTrace 사용 금지
	    }
	  }
	}

	//좋은 예
	/*
	class Foo5 {
	  // 로거 선언. 선언 방법은 프로젝트 표준에 따라 다들 수 있음.
		
	  private static final Logger LOGGER = LoggerFactory.getLogger(this.class);
	  void bar() {
	    try {
	      // do something
	    } catch (Exception e) {
	        LOGGER.error(e.getMessage(), e);  // 로거 사용
	    }
	  }
	}
	*/
	//while문 사용 시 중괄호 미 사용 
	// for, while 반복문에서 코드가 단 한 줄만 있을 경우라도 소스코드의 구역을 제대로 구분할 수 있도록 괄호{}를 반드시 사용
	//나쁜 예
	/*
	for(int i1=0; i < 10; i++)
	    size++;

	while(size<20)
	    size++;

	//좋은 예
	int size1=0;
	for(int i2=0; I < 10; i++) {
	    size1++;
	}

	while(size<20) {
	    size1++;
	}
	*/
	// Fin	
}
