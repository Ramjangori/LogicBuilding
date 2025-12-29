package logicBuilding;
import java.util.*;
// problem -> reverse an array 
public class Problem11 {
   public static void main(String[] arg) {
	   Scanner sc = new Scanner(System.in);
	   int arr[] = {5,6,7,8,3,4,5,7,8,9}; // Declaring an arrya 
	   
	   int arr2[] = new int[arr.length]; // declaring second array for reverse 
	   int j=0; // starting index of arr2
	   for(int i=arr.length-1 ; i>=0 ; i--) {
		   arr2[j] = arr[i]; // adding last element of arr to first element or arr2
		   j++; // increase j to add new element 
	   }
	   
	   int i = 0;
	   while(i<arr2.length) {
		   System.out.println(arr2[i]);
		   i++;
	   }
   }
}
