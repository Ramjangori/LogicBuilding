package logicBuilding;
import java.util.*;
public class Problem14 {
  public static void main(String[] arg) {
	  Scanner sc = new Scanner(System.in);
	  int arr[][] = new int[4][4];  // Creating two d array 
	  System.out.println("Enter matrix Elements"); // Taking elements in a matrix 
	  for(int i=0 ; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  arr[i][j] = sc.nextInt();
		  }
	  }
	  
	  int square[][] = new int[4][4]; // declaring new array for square 
	  
	  // Finding square 
	  for(int i=0 ; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  square[i][j] = arr[i][j] * arr[i][j];
		  }
	  }
	  // Printing new matrix 
	  System.out.println("New matrix :");
	  for(int i=0 ; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  System.out.print(square[i][j] );
		  }
		  System.out.println(" ");
	  }
	
  }
}
