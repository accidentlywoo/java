package swexpert.j2;

class BadBankingException extends Exception{
	public BadBankingException(String s) {
		super(s);
	}
}

class Account {
	String name;
	int currentMoney;
	
	public Account(String name, int currentMoney) {
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public void withdraw(int money) throws BadBankingException{
		if(currentMoney < money)
			throw new BadBankingException("잔액이 부족합니다");
		currentMoney = currentMoney - money;
	}
	
	public String toString() {
		return "Account [name="+name+", currentMoney ="+currentMoney+"]";
	}
}

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			Account wooAcount = new Account("woo", 100);
			wooAcount.withdraw(150);
			System.out.println(wooAcount.toString());
		}catch (BadBankingException e) {
			System.out.println(e.getMessage());
		}
		/*
		Account kimAccount = new Account("woo", 100);
		kimAccount.withdraw(150);
		System.out.println(kimAccount.toString());
		*/
	}
}
