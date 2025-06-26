import java.util.*;

public class Multiple {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int guessNum;

        while (true) {  
            System.out.print("Enter a number: ");
            guessNum = sc.nextInt();

            if (guessNum % 10 == 0) {
                
                continue;  
            }

            System.out.println("you are a genius");
        }

        
    }
}
