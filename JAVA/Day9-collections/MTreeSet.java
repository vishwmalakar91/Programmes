import java.util.*;  
public class MTreeSet{  
public static void main(String args[]){  
//Creating and adding elements  
TreeSet<String> ts=new TreeSet<String>();  
ts.add("Ravi");  
ts.add("Vijay");  
ts.add("Ravi");  
ts.add("Ajay");  
//traversing elements  
Iterator<String> itr=ts.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  