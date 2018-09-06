import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
public static void main(String[]args)
{
HashSet hs=new HashSet(); //create a has set	, duplicate entry not allowed
hs.add("B");
hs.add("A");
hs.add("D");
hs.add("E");
hs.add("C");
hs.add("F");
hs.add("F");
//hs.remove("A");
System.out.println(hs);
Iterator it=hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());	
	}
}
}