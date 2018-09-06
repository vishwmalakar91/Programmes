class MarutiSwift
{
void engine()
{
System.out.println("in swift engine method");
}
}

class MarutiDesire extends MarutiSwift
{

String name="Swift";
void engine()
{
System.out.println("in swift desireengine method");
}

public static void main(String[] args)
{
MarutiDesire s= new MarutiDesire() ;
s.engine();
//System.out.println(s.name);
}
}
