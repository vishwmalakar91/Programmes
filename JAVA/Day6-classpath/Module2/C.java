package Module2;
import Module1.*;
//D:\Java\Day6\Module1>javac -d . C.java
//D:\Java\Day6\Module1>java Module1.C
public class C
{
	//private int i=10;//private so access only in A class or same class
	//int i=10;//default public , but can not be access out side of package,
	public static void main(String[]args)
	{
		A a=new A();
		System.out.println(a.i);
		a.m1();
	}
}
