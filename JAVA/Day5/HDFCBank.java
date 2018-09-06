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
public void credit(){};
public void debit(){};
	
public static void main(String[] args)
{
HDFCBank H=new HDFCBank();
	H.debit();
	H.credit();
	H.loan();	
}
}