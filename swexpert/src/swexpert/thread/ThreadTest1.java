package swexpert.thread;

class MyThread extends Thread{
	String threadName;
	
	public MyThread(String threadName) {
		this.threadName = threadName;
	}
	
	//Thread기능을 구현하는 메서드이다.
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " " + threadName);
			try {
				sleep((int)(Math.random() * 1000));
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName+" 수행종료");
	}
}

public class ThreadTest1 {
	public static void main(String[] args) {
		System.out.println("---start--");
		MyThread first, second;
		first = new MyThread("First Thread");
		second = new MyThread("Second Thread");
		first.start();
		second.start();
		System.out.println("---end--");
	}
}
