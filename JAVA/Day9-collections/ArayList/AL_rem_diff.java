import java.util.*;  
 class AL_rem_diff {  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");   
          al.add("Anuj");  
          al.add("Gaurav");  
          System.out.println("An initial list of elements: "+al);   
          //Removing specific element from arraylist  
          al.remove("Vijay");  
          System.out.println("After invoking remove(object) method: "+al);   
          //Removing element on the basis of specific position  
          al.remove(0);  
          System.out.println("After invoking remove(index) method: "+al);   
            
          //Creating another arraylist  
          ArrayList<String> al2=new ArrayList<String>();    
          al2.add("Ravi");    
          al2.add("Hanumat");    
          //Adding new elements to arraylist  
          al.addAll(al2);  
          System.out.println("Updated list : "+al);   
          //Removing all the new elements from arraylist  
          al.removeAll(al2);  
          System.out.println("After invoking removeAll() method: "+al);   
          //Removing elements on the basis of specified condition  
          al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
          System.out.println("After invoking removeIf() method: "+al);  
          //Removing all the elements available in the list  
          al.clear();  
          System.out.println("After invoking clear() method: "+al);   
       }  
    }                   