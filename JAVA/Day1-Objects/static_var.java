class static_var
{
int i;//instance non static can be acces by reference only
static int j=50;//non static


public static void main(String[]args)
{
    static_var test1=new static_var();
    static_var test2=new static_var();
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
System.out.println(static_var.j); //clas name and var name


}


}