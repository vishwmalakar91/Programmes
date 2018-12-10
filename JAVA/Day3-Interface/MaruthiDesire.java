/*
Multiple inheritance is not allowed - MaruthiSwift,MaruthiDZ, you get an error
extends, implements - Key words for implementing inheritance
*/

//Grand parent class
class MaruthiSwift
{
	String Name = "Swift - Parent";
	void engine(){
	System.out.println("In Swift Engine method - Parent");
	}
}


//Parent class - using grand parent class
class MaruthiDesire extends MaruthiSwift
{

	//Overriding Parent properties by creating same properties in child class - in this case control never go to parent class
	String Name = "Swift - Child";
	
	//super is the key word used to call parent class objects
	void engine(){
	super.engine();
	System.out.println(super.Name);
	System.out.println("In Swift Engine method - Child");
	}

	
	void acceleration(){
		this.engine();
		System.out.println("In acceleration method");
	}

public static void main(String args[])
{

	MaruthiDesire s = new MaruthiDesire();
	s.engine();
	s.acceleration();
	System.out.println(s.Name);

}

}


//To run this perticular method  - java MaruthiDZ
//Child class using Parent calss - internally in Parent we call grand parent class
class MaruthiDZ extends MaruthiDesire{


public static void main(String args[])
{


	//MaruthiDesire s = new MaruthiDesire();
	MaruthiDZ s = new MaruthiDZ();
	s.engine();
	//s.acceleration();
	System.out.println(s.Name);

}


}