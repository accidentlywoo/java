package swexpert.thread;

public class MailBox {
	private String message;
	private boolean request;
	
	public synchronized void storedMessage(String message) {
		while (request == true) {
			try {
				wait();
				//synchronized lock을 해제한다.
			} catch (Exception e) {
			}
		}
		request = true;
		this.message = message;
		notify();
		//wait 상태에 들어가 있는 다른 Thread를 깨운다.
	}
	
	public synchronized String retrieveMessage() {
		while (request == false) {
			try {
				wait();
				//synchronized lock을 해제한다.
			} catch (Exception e) {
			}
		}
		return message;
	}
}
