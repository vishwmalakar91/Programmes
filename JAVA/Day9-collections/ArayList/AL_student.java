import java.util.ArrayList;
import java.util.Iterator;

public class AL_student{
    int roll_number;
    String Name;
    int age;
    AL_student(int roll_number,String Name,int age)
    {
        this.roll_number=roll_number;
        this.Name=Name;
        this.age=age;
    }
public static void main(String[] args) {
    AL_student S1=new AL_student(101,"Vishwa",21);
    AL_student S2=new AL_student(102, "Deepak", 22);
    AL_student S3=new AL_student(103, "Pranab", 23);

    ArrayList<AL_student> al=new ArrayList<AL_student>();
    al.add(S1);
    al.add(S2);
    al.add(S3);
    Iterator itr=al.iterator();
    while(itr.hasNext()){
        AL_student st= (AL_student)itr.next();
        System.out.println(st.roll_number+"-"+st.Name+"-"+st.age);
    }
}

}