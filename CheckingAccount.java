
public class CheckingAccount extends BankAccount {

	double FEE = 0.15;

	/**
	 * Constructor
	 * @param name
	 * @param amount
	 */
	CheckingAccount (String name,  double amount) {
		super( name,  amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	
	/**
	 * 
	 */
	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if (amount <= getBalance())
		{
			setBalance(getBalance()-amount- FEE);
		}
		else
		{
			completed = false;
		}
		return completed;
	}
}
