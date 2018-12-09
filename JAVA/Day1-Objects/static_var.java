class static_var
{
int i;//instance non static can be acces by reference only
static int j=50;//non static


public static void main(String[]args)
{
TestInst test1=new TestInst();
TestInst test2=new TestInst();
System.out.println(test1.i);
System.out.println(test2.i);
test1.i=10;
test2.i=20;
System.out.println(test1.i);
System.out.println(test2.i);

System.out.println(test1.j);
System.out.println(test2.j);
test1.j=30;
test2.j=40;
System.out.println(test1.j);
System.out.println(test2.j); //ref.var

System.out.println(j);//direct
System.out.println(TestInst.j); //clas name and var name


}


}