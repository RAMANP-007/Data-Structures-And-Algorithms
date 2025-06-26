import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println("Result: " + (A + B));
                break;

            case '-':
                System.out.println("Result: " + (A - B));
                break;

            case '*':
                System.out.println("Result: " + (A * B));
                break;

            case '/':
                if (B != 0) {
                    System.out.println("Result: " + (A / B));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
