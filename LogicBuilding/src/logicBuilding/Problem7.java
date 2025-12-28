package logicBuilding;
// Problem -> Checking a number is palindrome or not 
// if reverse of X is X than number is palindrome 
import java.util.Scanner;

public class Problem7 {
	public static void main(String[] arg) {
		  Scanner sc = new Scanner(System.in); // obj of Scanner class
		  System.out.println("Enter X :"); // input 
		  int x = sc.nextInt(); // store input 
		  int org = x ; // store original number to campare further with reverse 
		  int xReverse = 0; // var for store reverse of X
		  // loop for removing last digit and adding to front 
		  while(x>0) {
			  int rem = x%10; // geting last digit from x
			  xReverse = xReverse*10 +rem;  // adding last digit to reverse 
			  x = x/10;  // updating x 
		  }
		  if(org == xReverse) // Checking Reverse of X with X 
		  {
		  System.out.println("X is Palindrome "); // Palindrome if true
	  }
		  else {
			  System.out.println("X is not palindrome "); // not palindrome of false 
		  }
	   
	}
}
