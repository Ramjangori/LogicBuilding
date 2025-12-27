package logicBuilding;
import java.util.Scanner;   // import Scanner Class 
//extracting digit from a number 
public class Prblm1 {
    public static void main(String[] arg) {
    	Scanner sc = new Scanner(System.in);  // Creating Object of Scanner class 
    	System.out.println("Enter Number :"); // Taking input from User 
    	int n = sc.nextInt(); // Stroing number in a variable 
    	
    	
    	// applying While loop to geting last digit of number until n>0
    	while(n>0) {
    		int digit = n%10;  // geting last digit from a number 
    		
    		System.out.println(digit); // Printing digit 
    		n = n/10; // Updating Number 
    	}
    	 
    	 
    }
}
