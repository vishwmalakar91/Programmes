public class ExcepTest1
{
		public static void main(String args[])
	{
		int a[]=new int[2];
		try{
		String s1=null;
		int i=10/0; //code wil stop here : Exception in thread "main" java.lang.ArithmeticException: / by zero
		s1.toString();//Exception in thread "main" java.lang.NullPointerException
		System.out.println("Access element three"+a[32]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 32
		}
		
		catch (Exception e)//handle all type of exception
		{
		System.out.println("exception thrown"+e);
		e.printStackTrace();//java.lang.ArithmeticException: / by zero, at ExcepTest1.main(ExcepTest1.java:8)
		}
		
		
		System.out.println("out of the block");//it will print now
	}
}
