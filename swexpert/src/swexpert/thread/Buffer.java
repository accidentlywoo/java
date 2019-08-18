package swexpert.thread;

public class Buffer {
	private int contents;
	private boolean flag = false;
	
	// 버퍼에 데이터를 저장하는 메서드로서 동기화한다.
	public synchronized void put(int value) {
		if(flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		contents = value;
		flag = true;
		System.out.println("생산자 : 생상 "+contents);
		notifyAll();
	}
	
	//버퍼에서부터 데이터를 가져가는 메서드로서 동기화한다.
	public synchronized void get() {
		if(flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("소비자 : 소비 "+contents);
		flag = false;
		notifyAll();
	}
}
