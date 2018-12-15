import java.util.*;

class HM_compare {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        // Returns a Set view of the mappings contained in this map
        map.entrySet()
                // Returns a sequential Stream with this collection as its source
                .stream()
                // Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                // Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}