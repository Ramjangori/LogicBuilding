package logicBuilding;
// Printing Fabbo Series up to n terms 
// Ex-> 1 , 2, 3, 5, 8, 13 it means next term is sum of previous two terms 
import java.util.*;
public class Problem17 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	System.out.println("Enter N :");
	int n = sc.nextInt();
	int count = 0; // count the terms up to n
	int first = 0; // first term 
	int second = 1; // Second term 
	int third;  // third term = first + second 
	/* How it works -> 1. we put condition count <n starting count is 0 
	 * 2. print first term and increase count by +1
	 * 3. update terms third = first + second 
	 *                 first = second 
	 *                 second = third 
	 *                 repeat after priinting until count < n
	 * 
	 * */
	
	
	while(count<n) {
		System.out.print(first + " ");
		count++;
		third = first + second;
		first = second;
		second = third;
	}
}
    
}
