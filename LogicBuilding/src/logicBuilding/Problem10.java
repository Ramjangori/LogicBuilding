package logicBuilding;
// Problem -> take two digit number and check that two digit number is special number or not 
// Special Number => Number = (sum of digits) + (multiplication of digit)
import java.util.*;
public class Problem10 {
   public static void main(String[] arg) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter two digit number :"); // taking input 
	   int n = sc.nextInt(); // storing input
	   int sol=n; // storing original to fruther comapre
	   int a = n%10; // geting first digit
	   n = n/10; // updating n
	   int b=n%10; // geetinig second digit 
	   if(sol==(a+b)+(a*b)) // checking condition for special number 
	   {
		   System.out.println("Special Digit Number");
	   }
	   else {
		   System.out.println("Not a special digit Number ");
	   }
	   
	   
   }
}
