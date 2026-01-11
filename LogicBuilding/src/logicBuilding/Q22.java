package logicBuilding;
// find missing number in array 
public class Q22 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,6,7,8};
	int missing = 0;
	int sum = 0;
	for(int i=0 ; i<=arr.length-1 ; i++) {
		sum = sum + arr[i];
	}
	
	missing = (((arr.length+1)*((arr.length+1)+1))/2)-sum;
	System.out.println("Missing Term is = " + missing);
}
}
