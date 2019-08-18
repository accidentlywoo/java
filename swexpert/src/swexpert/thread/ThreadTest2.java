package swexpert.thread;

class RunnableThread implements Runnable {
	String threadName;
	
	public RunnableThread(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " " + threadName);
			try {
				Thread.sleep((int)(Math.random() * 1000));
			}catch (Exception e) {
			}
		}
		System.out.println(threadName+"수행 종료");
	}
 	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("-start-");
		Thread thread1 = new Thread(new RunnableThread("First Thread"));
		Thread thread2= new Thread(new RunnableThread("Second Thread"));
		thread1.start();
		thread2.start();
		System.out.println("-end-");
	}
}
