import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
public static void main(String[]args)
{
HashSet hs=new HashSet(); //create a has set, duplicate entry not allowed
hs.add("B");
hs.add("A");
hs.add("D");
hs.add("E");
hs.add("C");
hs.add("F");
hs.add("F");
//hs.remove("A");
//hs.clear();


HashSet hs1=new HashSet();
hs1.add("B1");
hs1.add("A2");
System.out.println(hs1);
hs.addAll(hs1);

hs.removeAll(hs1);
System.out.println(hs1);
System.out.println(hs.size());
System.out.println(hs);
Iterator it=hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());	
	}
}
}