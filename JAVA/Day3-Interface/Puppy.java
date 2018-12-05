class Puppy{

int i;
//constructor doesnt has return type
//Constructor can be used to initialise method and variable in the beginning
//Constructor can be used similar to functions but majorly for initializing the variable or methods

Puppy(){
	//Default contructor
	System.out.println("Default constructor");

}

Puppy(String name){
	//This constructor has one parameter/overloaded constructor
	System.out.println("Passed name is :"+name);
}

Puppy(int j){
	//Constricutor has integer parameter
	i = j;
	System.out.println("Value of i is :"+i);

}

void puppyAge()
{
	int age = i + 10;
	System.out.println("Age after 10 years is :"+age);

}

public static void main(String args[]){

Puppy p1 = new Puppy();
Puppy p2 = new Puppy("Tommy");
Puppy p3 = new Puppy(10);
p3.puppyAge();

Puppy p4 = new Puppy(15);
p4.puppyAge();

}


}