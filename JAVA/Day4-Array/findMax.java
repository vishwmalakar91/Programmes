public class findMax {
    public static void main(String[] args) {
        double[] myList = {1.1, 1.2, 1.3, 1.4, 2.2};
        //Finding largest element
        double max = myList[0];
    
        for (int i = 1; i<myList.length; i++ ){
            System.out.println("For loop 3");
        
            if(myList[i] > max){
                max = myList[i];
                
        
        }
        System.out.println("Max is :"+max);
        }
    }
    
}
