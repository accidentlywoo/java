package com.java.basic.controlfloor;

public class For99 {
	public static void main(String[] args) {
		int i,j;
//		구구단 2~9출력
		for(i=2;i<10;i++) {
			System.out.println(i+"단"+"\n");
			for(j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}

}
