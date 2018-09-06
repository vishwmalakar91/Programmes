class MarutiSwift
{
String name="Swift";
void engine()
{
System.out.println("in swift engine method");
}
}
class MarutiDesire extends MarutiSwift
{
public static void main(String[] args)
{
MarutiDesire s= new MarutiDesire() ;
s.engine();
System.out.println(s.name);
}
}
