import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
public static void main(String[] args) throws IOException
{
File file=new File("hello.txt");
System.out.println("abs path"+file.getAbsolutePath());
if(file.createNewFile())
{
System.out.println("file created successsfully");	
}
FileWriter writer =new FileWriter(file);
writer.write("this is an example");
writer.close();
FileReader fr=new FileReader(file);
char[] a=new char[50];
fr.read(a);
for(char c:a)
	System.out.println(c);


}
}
