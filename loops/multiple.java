import java.util.*;

public class multiple {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int guessNum;

        while (true) {  
            System.out.print("Enter a number: ");
            guessNum = sc.nextInt();

            if (guessNum % 10 == 0) {
                System.out.println("You entered a multiple of 10. Exiting...");
                break;  
            }

            System.out.println("The number is not a multiple of 10. Try again.");
        }

        sc.close(); 
    }
}
