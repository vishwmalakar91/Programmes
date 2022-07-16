public class NeeIndex {
    public static void main(String[] args) {

//String declaration using new keyword
String s[] = new String[4];

s[0] = "Sudesh";
s[1] = "Sukesh";
s[2] = "Sunil";
s[3] = "Suresh";

//print all array element
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

