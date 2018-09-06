class TestArray 
{
	public static void main(String[] args) 
	{
		double[] myList = {1.1, 1.2, 1.3, 1.4, 2.2};

		//To print all elements
		for(int i=0; i<myList.length; i++){
			System.out.println("For loop 1");
			System.out.println(myList[i]+ " ");
	}

	//Summing all elements
	double total = 0;

	for(int i = 0; i<myList.length;i++){
		System.out.println("For loop 2 :"+i);
		total = total+myList[i];
		}

		System.out.println("Total is :"+total);


	//Finding largest element
	double max = myList[0];

	for (int i = 1; i<myList.length; i++ ){
		System.out.println("For loop 3");
	
		if(myList[i] > max){
			max = myList[i];
			
	
	}
	System.out.println("Max is :"+max);
	}

//To prinl all element using enhanced for loop
double[] myList1 = {2.1, 2.2, 2.3, 2.4, 2.5};

for(double element:myList1){
	System.out.println("For loop 4");
	System.out.println(element+", ");
}

//String declaration using new keyword
String s[] = new String[4];

s[0] = "Sudesh";
s[1] = "Sukesh";
s[2] = "Sunil";
s[3] = "Suresh";

//rint all array element
for (String names:s){
	System.out.println("For loop 5");
System.out.println("Names are :"+names);
}

printArray(new double[] {3.1,3.2,3.3,3.4}); //Passing entire array as an input - object since we are using new keyword

}

public static void printArray(double[] array){
	for (int i = 0; i<array.length; i++ )
	{
		System.out.println("For loop 6");
		System.out.println(array[i] + "");
	}


}
}
