class Dog
{
int age=10;
String color="brown";
void barks()
{
System.out.println("dogg barks");
}
//public static void main1(String[]args) -it will not work
public static void main(String[]args)

{
Dog d=new Dog();
d.barks();
System.out.println("Age of dog is "+d.age);
System.out.println("color is "+d.color);
}

}