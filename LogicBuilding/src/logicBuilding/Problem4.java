package logicBuilding;
// calculating sum of prime digit in a number 
// Prime number -> The number which is divisible by 1 or itself Ex. 5 is prime it divisible by 1,5
import java.util.Scanner;

public class Problem4 {
	 public static void main(String[] arg) {
		   Scanner sc = new Scanner(System.in); // Making obj of Scanner class 
		   System.out.println("Enter Number :"); // taking input 
		   int n = sc.nextInt(); // storing number 
		   int primeSum = 0;
		   while(n>0) {
			   int rem = n%10;
			   int i =1;
			   int count=0; // declaring variable to target how many times n divides 
			   while(i<=rem) {
				   if(rem%i==0) {
					   count++;
				   }
				   i++;
			   }
			   
			   if(count==2) {
				   primeSum = primeSum + rem;
			   }
			   n = n/10;
		   }
		   
		   
		   System.out.println(primeSum);
		   
		   
			   
		   }
		   
		   
		  
}
