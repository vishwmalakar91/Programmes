import java.util.*;

class Array_List_Diff_Itr {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();// Creating arraylist
        al.add("Ravi");// Adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        // Traversing list through Iterator
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Traversing list list aterator
        System.out.println("===============");
        ListIterator lit=al.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }

        // Traversing list through for each
        System.out.println("===============");

        for (String obj : al) {
            System.out.println(obj);
        }

        // Traversing list through for loop
        System.out.println("===============");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }


    }
}