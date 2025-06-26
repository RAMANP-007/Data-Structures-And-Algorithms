import java.util.*;

public class Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) { 
            sum += i;
            }
        
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
