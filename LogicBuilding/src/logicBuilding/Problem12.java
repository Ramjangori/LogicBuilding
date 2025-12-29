package logicBuilding;
// Problem-> Finding Greatest Common Devisior 
import java.util.*;

public class Problem12 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		// Take two input 
		System.out.println("Enter Two Number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		// finding min of that two number 
		int min;
		if(a>b) min = b;
		else min = a;
		while(min>0) {
			if(a%min==0 & b%min==0) {
				System.out.println("GCD : " + min);
				break;
				
			}
			min--;
		}
	}

}
