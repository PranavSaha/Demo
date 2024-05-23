package Day2;

public class Account {
	
	
	
	
	
	public Account(long account_number, int pin) {
		super();
		this.account_number = account_number;
		this.pin = pin;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	long account_number;
	int pin;
	

}
