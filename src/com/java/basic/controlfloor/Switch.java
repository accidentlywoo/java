package com.java.basic.controlfloor;

public class Switch {
//	byte,char,int,enum,String 타입만 사용가능
	public static void main(String[] args) {
		int a=1;
		switch(a) {
		case 1: case 2: case 3:
			System.out.println("1~3");
			break;//break안쓰면 case문 전체실행
		case 4: case 5:
			System.out.println("4~5");
			break;
		case 6: case 8:
			System.out.println("6,8");
			break;
		case 7: case 10:
			System.out.println("7,10");
			break;
		default:
			System.out.println("9와 10초과의 값");
			break;
		}
		
	}

}
