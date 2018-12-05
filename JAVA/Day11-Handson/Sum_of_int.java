import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Sum_of_int {	
	@SuppressWarnings("unused")
	private static String line;

	public static void main(String args[])
	{
		try{
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Vishwanath\\Desktop\\File1.txt"));
		int CharCount=0;	
		System.out.println(CharCount);
		bf.close();
	}	
	catch(IOException e)
	{
		System.out.println("IO Error "+e.toString());
	}
	}
}