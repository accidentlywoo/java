package swexpert.j2;

abstract class TV {
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void volumeUp();
	public abstract void volumeDown();
}

class S_TV extends TV{

	public void powerOn() {
		System.out.println("S TV po on");
	}

	public void powerOff() {
		System.out.println("S TV po off");
	}

	public void volumeUp() {
		System.out.println("S TV vo up");
	}

	public void volumeDown() {
		System.out.println("S TV vo do");
	}
	
}

class L_TV extends TV{

	public void powerOn() {
		System.out.println("L TV po on");
	}

	public void powerOff() {
		System.out.println("L TV po off");
	}

	public void volumeUp() {
		System.out.println("L TV vo up");
	}

	public void volumeDown() {
		System.out.println("L TV vo do");
	}
	
}
//추가
class TVFactory{
	public TV getTV(String tvName) {
		if(tvName.equals("A사"))
			return new S_TV();
		else if(tvName.equals("B사"))
			return new L_TV();
		return null;
	}
}

public class AbstractTVUser{
	public static void main(String[] args) {
		//S_TV tv = new S_TV();
		//tv.powerOn();
		TVFactory factory = new TVFactory();
		TV tv = factory.getTV(args[0]);
		tv.powerOn();
		tv.powerOff();
	}
}