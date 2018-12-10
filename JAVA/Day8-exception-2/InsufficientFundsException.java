public class InsufficientFundsException extends Exception
{
private double amount;
public InsufficientFundsException (double amount1)
{
amount=amount1;	
}
public double getAmount()
{
	System.out.println(amount);
	return amount;
}
}