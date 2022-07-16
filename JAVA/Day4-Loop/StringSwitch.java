public class StringSwitch{

public static void main(String args[]){


int numOfPlayer = 0;

String sport = "volleyball";

switch(sport){
case "tennis":
	numOfPlayer = 1;
	break;

case "volleyball":
	numOfPlayer = 6;
	break;

case "baseball":
	numOfPlayer = 9;
	break;

}
System.out.println("No of players :"+numOfPlayer);

}


}