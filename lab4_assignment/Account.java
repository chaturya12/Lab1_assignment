/**
 * DESC:to create account class
 * @author chaturya
 *
 */
public class Account {
 protected long accNum;
 protected double balance;
 private Person accHolder;
 
 public Account() {
	 
 }
 /**
  * parameterized constructor 
  * @param accNum
  * @param balance
  */
 public Account(long accNum, double balance) {
	
	this.accNum = accNum;
	this.balance = balance;
	
}
 /**
  * to get account number
  * @return account number
  */
  public long getAccNum() {
	return accNum;
  }
  /**
   * to set account number
   * @param accNum
   */
  public void setAccNum(long accNum) {
	this.accNum = accNum;
  }
  /**
   * to get balance
   * @return balance
   */
  public double getBalance() {
	return balance;
  }
  /**
   * to set balance
   * @param balance
   */
  public void setBalance(double balance) {
	this.balance = balance;
  }
  /**
   * to set account holder
   * @param accHolder
   */
  
  public void setAccHolder(Person accHolder)
  {
    this.accHolder=accHolder;	
  }
  /**
   * to get person
   * @return account holder
   */
  public Person getPerson() {
	return accHolder;
  }
  /**
   * method to deposit amount
   * @param amt
   */
  public void deposit(double amt)
  {
      balance=balance+amt;	
      System.out.println("The amount after deposit "+amt+" is ="+balance);
  }
  /**
   * method to withdraw amount
   * @param amt
   */
  public void withdraw(double amt) {
	 if(balance>=amt)
	{
		balance=balance-amt;
		System.out.println("The balance after withdraw "+amt+ " is = "+balance);
	}
	else {
		System.out.println("You don't have enough balance.");
	}
  }
}
