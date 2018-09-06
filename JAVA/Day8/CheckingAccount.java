public class CheckingAccount
{
	private double balance;
	private int number;
	public CheckingAccount(int number1)
	{
		number=number1;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			double needs=amount-balance;
			System.out.println("insufficient funds,required ammount :"+needs);
			throw new InsufficientFundsException(needs);
			//System.out.println(needs);//CheckingAccount.java:24: error: unreachable statement
		}
	}
}
