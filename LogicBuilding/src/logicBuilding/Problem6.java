package logicBuilding;

// Problem -> taking a number x and print reverse of x
import java.util.Scanner;
public class Problem6 {
  public static void main(String[] arg) {
	  Scanner sc = new Scanner(System.in); // obj of Scanner class
	  System.out.println("Enter X :"); // input 
	  int x = sc.nextInt(); // store input 
	  int xReverse = 0; // var for store reverse of X
	  // loop for removing last digit and adding to front 
	  while(x>0) {
		  int rem = x%10; // geting last digit from x
		  xReverse = xReverse*10 +rem;  // adding last digit to reverse 
		  x = x/10;  // updating x 
	  }
	  
	  System.out.println("Reverse of x is : " + xReverse); // printing final result 
  }
}
