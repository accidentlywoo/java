package com.anno;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service 클래스로부터 메서드 정보를 불러옴.
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)){
				//printAnnotation 객체 얻기
				PrintAnnotation pa = method.getAnnotation(PrintAnnotation.class);
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				//구분선 출력
				for(int i=0;i<pa.number();i++) {
					System.out.println(pa.value());
				}
				System.out.println();
				try {
					//정보를동해 동일 메소드를 Service객체에서 호출된다.
					method.invoke(new Service());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
				
	}
}