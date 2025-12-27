package logicBuilding;
//Calculating Sum of Digits in a Number 
import java.util.Scanner;
public class Problem2 {
   public static void main(String[] arg) {
	   Scanner sc = new Scanner(System.in); // Making obj of Scanner class 
	   System.out.println("Enter Number :"); // taking input 
	   int n = sc.nextInt(); // storing number 
	   int sum=0; // declaring variable for calculating sum 
	   
	   // loop for geting last digit from number and adding to the sum
	   while(n>0) {
		   sum = sum + n%10;
		   n = n/10;
	   } 
		   
	  System.out.println("Sum of Digits is : " + sum); // printing final sum 
   }
}