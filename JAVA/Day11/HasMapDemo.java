import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapDemo {
	public static void main(String[]args)
	{
		HashMap hm=new HashMap();
		hm.put("Amit", new Double(344.34));
		hm.put("Sachin", new Double(124.34));
		hm.put("Zubir", new Double(99.34));
		hm.put("Senthil", new Double(844.34));
		hm.put("Riyaz", new Double(-344.34));
		hm.put("Riyaz", new Double(-24.34));
		Set set=hm.entrySet();
		System.out.println(set);
		
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		hm.put("Senthil", new Double(-99.99));
		System.out.println(hm.entrySet());
		System.out.println(hm.get("Senthil"));
		System.out.println("sachin New bal "+hm.get("Sachin"));
		System.out.println("sachin New bal "+hm.get("SachinTESTNULL"));
	}

}
