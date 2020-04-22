
public class SavingsAccount extends BankAccount {

	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	/**
	 * constructor
	 * @param name
	 * @param amount
	 */
	SavingsAccount(String name,  double amount){
		super( name,  amount);
		accountNumber  = getAccountNumber();
		setAccountNumber(accountNumber + "-" +savingsNumber);	
	}
	
	/**
	 * copy constructor
	 * @param p
	 * @param amount
	 */
	SavingsAccount(SavingsAccount p, double amount){
		super( p, amount );
		accountNumber  = p.accountNumber;
		setAccountNumber(p.accountNumber + "-" + p.savingsNumber+1);	
	}
	
	public void postInterest () {
		super.deposit(super.getBalance()*(rate/(100*12)));;
	}
	
	public String getAccountNumber()
	{
		String str =(accountNumber + "-" +savingsNumber);
		return str;
	}
	
}
