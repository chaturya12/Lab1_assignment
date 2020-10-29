
public class CurrentAccount extends Account{
    
	private int overdraftLimit=100;
    
	
	public CurrentAccount(long accNum,double balance,int overdraftLimit) {
		super(accNum, balance);
		this.overdraftLimit= overdraftLimit;
	}
	
	public CurrentAccount() {
		
	}

	@Override
	 public void withdraw(double amt) {
		if(balance<(-overdraftLimit)) {
			System.out.println("Over draft Limit is crossed");
		
		}
		else {
			System.out.println("Successful Withdrawal");
		}
	}

}
