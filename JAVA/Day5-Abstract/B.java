//class A
abstract class A
{
	abstract public void m1();//abstract method
	//public void m1();//abstract method
	//abstract public void m2
	abstract public void m2();
	public void m3() //non abstarct method
	{
		System.out.println("dev plz override this method in child");
	}
}

 //abstract class B extends A{
 class B extends A
	 {
	public void m1()
	{
		System.out.println("B in m1");
	}
	public void m2()
	{
		System.out.println("this is m2 method in class B");
	}
	public static void main(String[]args)
	{
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		//A a=new A();//A is abstract; cannot be instantiated
	}
	
	} 
