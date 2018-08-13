package com.java.basic.controlfloor;

import java.util.Scanner;

public class IfThenElse {
	public static void main(String[] args) {
		int a=10, b=20;
		boolean flag=false;
		if(a>10) {
			System.out.println("a는 10보다 크다");
		}else {
			System.out.println("a는 10보다 크지 않다");
		}
		
		if(a==10 && b>=20) {
			System.out.println("조건을 만족함");
		}else {
			System.out.println("조건을 만족하지 못함");
		}
		
		if(flag) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
//		if - else if - else
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하라");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");
		}else if(jumsu>=80) {
			System.out.println("B");
		}else if(jumsu>=70) {
			System.out.println("C");
		}else if(jumsu>=60) {
			System.out.println("D");
		}else {}
		
	}
}
