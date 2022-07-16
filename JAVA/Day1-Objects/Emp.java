class Emp
{
int EmpId;//instance non static can be acces by reference only
String EmpName;
static String companyName="Amdocs";//non static


public static void main(String[]args)
{
Emp e1=new Emp();
Emp e2=new Emp();
Emp e3=new Emp();
Emp e4=new Emp();

e1.EmpName="Sa";
e1.EmpId=1000;
e1.EmpName="Sal";
e1.EmpId=1001;
e1.EmpName="Salo";
e1.EmpId=1002;
e1.EmpName="Saloni";
e1.EmpId=1003;
e1.companyName="E1 New Amdocs";

System.out.println(e1.EmpName); 
System.out.println(e1.EmpId);
System.out.println(e1.companyName);
System.out.println("-------------------");
System.out.println(e2.EmpName); 
System.out.println(e2.EmpId);
System.out.println(e2.companyName);
System.out.println("-------------------");
e3.companyName="Amdocs Global";
System.out.println(e4.EmpName); 
System.out.println(e4.EmpId);
System.out.println(e3.companyName);
System.out.println(e4.companyName);
System.out.println(e1.companyName);

}
}