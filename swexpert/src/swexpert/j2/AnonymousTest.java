package swexpert.j2;

public class AnonymousTest {
	public static void watchTV(TV tv) {
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
	
	public static void main(String[] args) {
		watchTV(new TV() {

			@Override
			public void powerOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void powerOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
