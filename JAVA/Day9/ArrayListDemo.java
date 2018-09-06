import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		System.out.println("initial size of al :"+al.size());
		al.add("C");
		al.add("F");
		al.add("A");
		al.add("B");
		al.add("D");
		al.add("C");
		al.add("F");
		al.add("E");
				
		System.out.println("contents of al :"+al);
		System.out.println("size of al after addition :"+al.size());
		al.set(2, "X");//replace A with X
		System.out.println("contents of al after seting A=>X:"+al);
		System.out.println("size of al after addition :"+al.size());
		al.remove("C");
		al.remove(2);
		System.out.println("contents of al after remove :"+al);
		System.out.println("size of al after addition after remove C and index 2:"+al.size());
		ListIterator it=al.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
				
	}

}
