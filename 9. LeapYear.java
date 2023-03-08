import java.lang.*;
import java.util.*;
class LeapYear{
  	public static void main(String[] args){
  	int year;
  	Scanner scan= new Scanner(System.in);
  	System.out.println("Enter year: ");
  	year= scan.nextInt();
  	if (year % 4 == 0){
	System.out.println("Leap year!");
	}
	else{
	System.out.println("Not a leap year");
    }
  }
}


