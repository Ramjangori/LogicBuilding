package logicBuilding;
import java.util.Scanner; 

// Problem -> To count number of digit in a number 
public class Problem5 {
  public static void main(String[] arg) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Number"); // input 
	  int n = sc.nextInt(); // store input 
	  int count = 0; // count variable to count digits 
	  while(n>0) {
		  n=n/10; // remove last digit and increase count until n==0
		  count++;
	  }
	  System.out.println("Number of digits is :" + count); // print final count 
  }
}
