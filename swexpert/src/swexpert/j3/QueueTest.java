package swexpert.j3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//Queue를 구현한 대표적인 클래스를 통해 객체 생성
		for(int i = 0; i <= 3; i++) {
			queue.add("데이터 -"+i);
		}
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		//프론트값 하나씩 보기
	}
}
