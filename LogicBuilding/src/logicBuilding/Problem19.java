package logicBuilding;
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int org = num;
        int arm = 0;
        int count = 0;

        // Count digits
        while(num > 0) {
            num /= 10;
            count++;
        }

        num = org;
        // Calculate Armstrong
        while(num > 0) {
            int rem = num % 10;
            arm += (int)Math.pow(rem, count);
            num /= 10;
        }

        if(org == arm) {
            System.out.println("Number is Armstrong.");
        } else {
            System.out.println("Number is not Armstrong.");
        }
    }
}