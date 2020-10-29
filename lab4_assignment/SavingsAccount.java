
public class SavingsAccount extends Account{

	final double minimumBalance=500.00;
	
	
	public SavingsAccount(long accNum, double balance) {
		super(accNum, balance);
		
	}
	@Override
	public void withdraw(double amt) {
		if(balance >=amt)
		{
			balance=balance-amt;
			System.out.println("The balance after withdraw "+amt+ " is ="+balance);
		}
		else {
			System.out.println("You don't have enough balance.");
		}
		if(balance>=minimumBalance) {
			System.out.println("You have minimum balance.");
		}
		else {
			System.out.println("You need to maintain minimum balance.");
		}
	}
  
}
