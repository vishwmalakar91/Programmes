public class Array2 {
    	//Summing all elements
    
    public static void main(String[] args) {
        double total = 0;
        double[] myList = {1.1, 1.2, 1.3, 1.4, 2.2};

        for(int i = 0; i<myList.length;i++){
            System.out.println("For loop 2 :"+i);
            total = total+myList[i];
            }
    
            System.out.println("Total is :"+total);
        
    }


}
