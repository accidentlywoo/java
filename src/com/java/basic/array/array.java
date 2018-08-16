package com.java.basic.array;

public class array {
 public static void main(String[] args) {
	 int[] arr1 = {1,2,3};
	 int[] arr2 = arr1;
//	 int i;
	 for(int i=0;i<arr2.length;i++) {
		 System.out.println(arr2[i]);
	 }
	 System.out.println("배열 arr1의 참조값 : "+arr1);
	 System.out.println("배열 arr2의 참조값 : "+arr2);
	 
	 int[] src = {1,2,3,4,5}; //원본 배열
	 int[] dest = new int[3];
	 int i;
	 System.arraycopy(src, 1, dest, 0, 3); //배열 복사
	 System.out.println("원본배열");
	 for(i=0;i<src.length;i++) {
		 System.out.println(src[i]+"\t");
	 }
	 System.out.println("\n복사배열");
	 for(i=0;i<dest.length;i++) {
		 System.out.println(dest[i]+"\t");
	 }
	 dest[2]=50; //dest 2번 요소 값 변경
	 System.out.println("\n원본배열");
	 for(i=0;i<src.length;i++) {
		 System.out.println(src[i]+"\t");
	 }
	 System.out.println("\n복사배열");
	 for(i=0;i<dest.length;i++) {
		 System.out.println(dest[i]+"\t");
	 }
 }
}
