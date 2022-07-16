package Module2;
import Module1.*;
//private -same class
//default-same package ,outside package not allowed
//public -anywhere
//protected same package + child class in other diff package
class D extends A{
	
	public static void main(String[]args)
	{
		D a=new D();
		System.out.println(a.i);
		a.m1();
	}
}