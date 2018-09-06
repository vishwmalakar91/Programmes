package Module1;
//D:\Java\Day6\Module1>javac -d . A.java
//D:\Java\Day6\Module1>java Module1.A
public class A
{
	//private int i=10;//private so access only in A class or same class
	//int i=10;//default public , but can not be access out side of package,
	//public int i=10;
	protected int i=10;//D can access not A
	//private void m1()
	public void m1()
	{
		System.out.println("in m1 method class A");
	}
	public static void main(String[]args)
	{
		A a=new A();
		System.out.println(a.i);
	}
}
