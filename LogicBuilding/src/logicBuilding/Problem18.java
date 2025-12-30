package logicBuilding;

public class Problem18 {
   public static void main(String[] args) {
	int arr[] = {5,7,8,2,3,4,9,23,40,45,};
	int max = arr[0];
	int max2 = arr[1];
	for(int i=0 ; i<arr.length ; i++) {
		if(arr[i]>max) {
			max2 = max;
			max = arr[i];
		}
		else if(arr[i]>max2 && arr[i]<=max)
		{
			max2 = arr[i];
		}
		
	}
	
	
		System.out.println("Second largest is " + max2);
	
	
}
}
