package logicBuilding;
// Problem -> Number of occurance digit in a number 
import java.util.Scanner;
public class Problem8 {
  public static void main(String[] arg) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Number :"); // taking number 
	  int n = sc.nextInt(); // storing number 
	  System.out.println("Enter Digit to Find cccurance :"); // taking digit to find occurance 
	  int digit = sc.nextInt(); // storing digit 
	  int count = 0; // var count for counting occurance 
	  // loop for geting last digit and matching with target digit if true increase count by 1
	  while(n>0) {
		  int rem = n%10;
		  if(rem == digit) count++;
		  n = n/10;
	  }
	   System.out.println("Occurance of " + digit + " is " + count); // final result 
  }
}
