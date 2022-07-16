import java.util.ArrayList;
import java.util.List;

class looptest{
public static void main(String[] args) {

    int x = -99;
    boolean check = true;
    byte checkByte = 127;
    char charTest = 'A';
    String myName = "Vishwa";
    String parentNames []= {"Vishwa1", "Vishwa2","Vishwa3"};

    for(String parentName :parentNames )
    {
        System.out.println(parentName); 
    }

    //==================================================================

    List <String> studentNames = new ArrayList<>();
    studentNames.add("John1");

    for(String studentName :studentNames)
    {
        System.out.println(studentName); 
    }
    
}
}