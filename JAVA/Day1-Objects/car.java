class car
{

int speed=100;
String company="Audi";

void engine()
{
System.out.println("Car Engine is Audi Engine");
}


public static void main(String[]args)
{
car car=new car();
car.engine();
System.out.println("speed of car is "+car.speed);
System.out.println("company is "+car.company);
}


}