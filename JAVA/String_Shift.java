public class String_Shift {
	public static void main(String args[])
	{
		int count=0;
		int[] x={-1,2,3-4,-5,6,8,-3,-2};
		System.out.println(x.length);
		for(int i=0;i<=x.length;i++)
		{
			
			if(x[i]>0)
			{
				 count++;
			}
		}
		System.out.println(count);
	}
}
