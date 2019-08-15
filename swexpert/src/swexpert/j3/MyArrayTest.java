package swexpert.j3;

public class MyArrayTest {
	public static void main(String[] args) {
		MyArray arr = new MyArray(5);
		for(int i = 1; i <= 5; i++) {
			arr.add("데이터-"+ i);
		}
		System.out.println(arr);
		System.out.println("MyArray 0번 index : "+arr.get(0));
		System.out.println("MyArray 3번 index : "+arr.get(3));
		
		arr.remove(3);
		System.out.println("MyArray 3번 index 삭제 후 : "+arr);
		
		arr.add("데이터-4");
		System.out.println("MyArray 새거 : "+arr);
	}
}
