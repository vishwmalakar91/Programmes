public class ExcepTest
{
		public static void main(String args[])
	{
		int a[]=new int[2];
		String s1=null;
		//int i=10/0; //code wil stop here : Exception in thread "main" java.lang.ArithmeticException: / by zero
		//s1.toString();//Exception in thread "main" java.lang.NullPointerException
		System.out.println("Access element three"+a[32]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 32
		System.out.println("out of the block");
	}
}
