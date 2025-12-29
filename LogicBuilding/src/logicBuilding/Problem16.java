package logicBuilding;
// BUBBLE SORT -> A sorting tecnique 
public class Problem16 {
   public static void main(String[] arg) {
	   
	   int arr[] = { 5,6,7,8,2,3,6,9,4}; // taking array 
	   int temp ; // taking temp for swaping 
	    // loop for sorting we compare adjecnt element and push largest element to the end of array 
	   for(int i =arr.length-1 ; i>=0 ; i--) {
		   for(int j =0 ; j<=i-1 ; j++) {
			   if(arr[j]>arr[j+1]) {  
				   temp = arr[j+1];
				   arr[j+1] = arr[j];
				   arr[j] = temp;
			   }
		   }
	   }
	   
	   for(int i=0 ; i<arr.length ; i++) {
		   System.out.println(arr[i]);
	   }
   }
}
