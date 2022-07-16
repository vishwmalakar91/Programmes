
//Defining interface

interface IPhone{

	public void color();
	public void display();

}

interface Samsung{
	public void Model();

}


//Defining class and using interface with key word 'implements'
class IPhone7 implements IPhone, Samsung{

public void color(){
	System.out.println("IPhone color is black");
}

public void display(){
	System.out.println("IPhone display is 6 inches");
}

public void Model(){
	System.out.println("Samsung method is called");
}



//Defining Main method
public static void main(String args[]){
	
	//Create an object
	IPhone7 p = new IPhone7();
	
	//Calling a method
	p.color();
	p.display();
	p.Model();


}//End of main method
}//End of class IPhone7