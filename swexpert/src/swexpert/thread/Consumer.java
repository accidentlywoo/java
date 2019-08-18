package swexpert.thread;

public class Consumer extends Thread{
	private Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			//소비자 쓰레디는 get() 메서드를 호출한다.
			buffer.get();
		}
	}
}
