package logicBuilding;
import java.util.*;
public class Problem13 {
  public static void main(String[] arg) {
	  Scanner sc = new Scanner(System.in);
	  int arr[][] = new int[4][4];  // Creating two d array 
	  System.out.println("Enter matrix Elements"); // Taking elements in a matrix 
	  for(int i=0 ; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  arr[i][j] = sc.nextInt();
		  }
	  }
	  
	  System.out.println("Matrix ");  // Printing original matrix  
	  for(int i=0 ; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  
			  System.out.print(arr[i][j]);
		  }
		  System.out.println(" ");
	  }

	  
	  System.out.println("Diagonal Element of Matrix "); // Printing diagonal el of matrix 
	  
	  for(int i=0 ; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  if(i==j) {
				  System.out.print(arr[i][j]);
			  }
			  
		  }
	  }
  }
}
