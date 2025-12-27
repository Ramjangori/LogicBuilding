package logicBuilding;
// Program to calculate Sum of Even add/odd digits in a number 

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] arg) {
		   Scanner sc = new Scanner(System.in); // Making obj of Scanner class 
		   System.out.println("Enter Number :"); // taking input 
		   int n = sc.nextInt(); // storing number 
		   int evenSum=0; // declaring variable for calculating sum of Even
		   int oddSum = 0; // declaring var for calculating odd sum
		   
		   // loop for geting last digit from number and adding to the evenSum if digit is even and to oddSum of digit is odd
		   while(n>0) {
			   
			   int rem  =n%10; // geting last digit 
			   if(rem%2==0) {
				   evenSum = evenSum + rem;  // add to evenSum of digit is Even
			   }
			   else {
				   oddSum = oddSum + rem; // adding to oddSum if Digit is Odd
			   }
			   n = n/10; // Updating number 
		   } 
			   
		  System.out.println("Even Digit Sum is : " + evenSum);
		  System.out.println("Odd Digit Sum is : " + oddSum);// printing final result 
	   }
	

}
