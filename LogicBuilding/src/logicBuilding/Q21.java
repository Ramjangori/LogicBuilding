package logicBuilding;
// Java Program to find duplicate in the array 
public class Q21 {
 public static void main(String[] args) {
	 int[] arr = {6,7,3,4,6,9,3};
	  for(int i = 0 ; i<=arr.length-1; i++) {
		  for(int j=i+1 ; j<=arr.length-1 ; j++) {
			  if(arr[i]==arr[j]) {
				  System.out.println(arr[i]+ " Duplicate in the array");
			  }
		  }
	  }
}
}
