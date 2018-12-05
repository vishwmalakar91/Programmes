public class BankDemo
{
	public static void main(String[] args)
	{
		try
		{
			CheckingAccount c=new CheckingAccount(101);
			System.out.println("Depositing 500");
			c.deposit(500.00);
			System.out.println("withdraw 100");
			c.withdraw(100.00);
			System.out.println("withdraw 600");
			c.withdraw(600.00);
			System.out.println("after withdraw 600");//will not get printed as Exception occured
		}
		catch (InsufficientFundsException e)
		{
		System.out.println("please check your account :"+e.getAmount());
		e.printStackTrace();		
		}
	}
}