import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SearchFile {	
	public static void main(String args[])
	{
		try{
		BufferedReader bf=new BufferedReader(new FileReader("Search1.txt"));
		int linecount =0;
		String line;
		System.out.println("Searching for"+args[0]+"in file..");
		while((line=bf.readLine())!=null)
		{
			linecount++;
			int indexfound=line.indexOf(args[0]);
					if(indexfound>-1)
					{
						System.out.println("word was found at position :"+indexfound+" on line :"+linecount);
						System.out.println("line"+line);
					}
					else 
						System.out.println("Not Found");
		}		
		bf.close();
	}	
	catch(IOException e)
	{
		System.out.println("IO Error "+e.toString());
	}
	}
}