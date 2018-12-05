
//Test Enhanced for loop
public class TestEnhanced
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,20,30,40,50};

		for (int i=0;i < numbers.length; i++ )
		{
			System.out.println(numbers[i]+ "");
		}

		for (int x: numbers) //Enhanced for loop where conditional and increment is not require
		{
			System.out.println(x+ ",");
		}
		System.out.println("\n"); //New line

		String[] values = {"Sudesh", "Sukesh", "Sunil"};
		for (String name : values )//Enhanced for loop where conditional and increment is not require
		{
			System.out.println(name);
			System.out.println(",");
		}
		}
	}
