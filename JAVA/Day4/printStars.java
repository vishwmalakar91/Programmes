//Write a Java program by using two for loops to produce the output shown below:

class  printStars
{
	public static void main(String[] args) 
	{
		printStar();
	}

	public static void printStar(){

		int i,j;
		for(i=0;i<20;i++){
			for(j=0;j<20-i;j++){
				System.out.print("*");
			}
			System.out.println("");

		}


	}
}
