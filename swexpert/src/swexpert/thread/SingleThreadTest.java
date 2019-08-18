package swexpert.thread;

public class SingleThreadTest {
	public static void main(String[] args) {
		System.out.println("싱글 Thread 프로그램 수행...");
		for(int i = 0; i < 10; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + i);
		}
	}
}
