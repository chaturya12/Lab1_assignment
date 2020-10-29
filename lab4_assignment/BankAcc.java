
public class BankAcc {

	public static void main(String[] args) {
		/**
		 * creating person objects
		 */
		Person person1= new Person("smith",35);
		Person person2= new Person("kathy",26);
		/**
		 * creating ACcount object
		 */
		Account acc1=new Account(1001345,2000);
		Account acc2=new Account(1001346,3000);
		
		acc1.setAccHolder(person1);
		acc2.setAccHolder(person2);
		
		//depositing 2000 to smith acc
		System.out.println("Account Holder: "+person1.getName());
		System.out.println("Account Number: "+acc1.getAccNum());
		
		  acc1.deposit(2000);
		  acc1=new SavingsAccount(12345, 4000.0);
		  acc1.withdraw(1000);
		  acc1=new CurrentAccount(); acc1.withdraw(1000);
		 
		
		System.out.println("--------------------------------");
		
		//withdraw 2000 from kathy acc
		System.out.println("Account Holder :"+person2.getName());
		System.out.println("Account Number :"+acc2.getAccNum());
		acc2.withdraw(2000);
		acc2= new SavingsAccount(12346,1000.0);
		acc2.withdraw(1000);
		acc2=new CurrentAccount();
		acc2.withdraw(1000);

	}

}
