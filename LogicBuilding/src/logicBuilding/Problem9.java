package logicBuilding;
// To Check the Given number is Prime or not 
// Prime number -> The number which is not negitive and divisible by only 1 and itself
import java.util.Scanner;


public class Problem9 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter N :");
	   int n = sc.nextInt();
	   int count = 0;
	   int i=1;
	   while(i<=n) {
		   if(n%i==0) count++;
		   i++;
	   }
	   if(count==2) {
		   System.out.println("Givin Number is Prime");
	   }
	   else {
		   System.out.println("Givin Number is Not prime");
	   }
   }
}
