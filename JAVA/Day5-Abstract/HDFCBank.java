abstract class Bank
{
abstract public void credit();
abstract public void debit();
public void loan()
{
System.out.println("in loan method");
}
}

class HDFCBank extends Bank
{
public void credit(){}; //must be defined
public void debit(){}; //must be defined
public void loan()
{
System.out.println("in HDFCBank loan method");
}
	
public static void main(String[] args)
{
HDFCBank H=new HDFCBank();
	H.debit();
	H.credit();
	H.loan();	
}
}