import java.util.*;  
public class MLinkedHasSet{  
public static void main(String args[]){  
LinkedHashSet<String> lhs=new LinkedHashSet<String>();  
lhs.add("Ravi");  
lhs.add("Vijay");  
lhs.add("Ravi");  
lhs.add("Ajay");  
Iterator<String> itr=lhs.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}