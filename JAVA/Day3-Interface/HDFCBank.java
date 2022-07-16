/* 
Interfaces can be seperated using comma(multiple inheritance)
Interface cannot have non abstract method(method with body)
Cannot create an object of Interface
*/
//Interface define
interface Bank {

	public void credit(int depAmt);

	public void debit(int wAmt);

	// public void test(int wAmt)
	// {
	// 	System.out.println("trying tocreated non abstract method");
	// };

}

// Interface define
interface RBI {
	public void interest(int iAmt);
}

// Define class
class WorldBank {
	public void loan() {
		System.out.println("In load method");
	}

}

// Class declaration
// Using another class and interface
class HDFCBank extends WorldBank implements Bank, RBI {

	// Instance variable
	int currentBal = 500;

	public void debit(int wAmt) {
		currentBal = currentBal - wAmt;
		System.out.println(currentBal);
	}

	public void credit(int depAmt) {
		currentBal = currentBal + depAmt;
		System.out.println(currentBal);
	}

	public void interest(int iAmt) {
		currentBal = currentBal + iAmt;
		System.out.println(currentBal);
	}

	public void checkBal(int iAmt) {
		System.out.println(iAmt);
	}

	// Main class
	public static void main(String args[]) {
		HDFCBank d = new HDFCBank();
		// Bank b = new Bank(); //Cannot create an object of any interface
		// Declare method
		d.debit(200);
		d.credit(500);
		d.interest(300);
		d.loan();

	}
}