public class IncomeTax {
    public static void main(String args[]) {
        int income = 180000;
        int tax;
        if (income < 500000) {
            System.out.println("No tax");
        } else if (income > 500000 && income < 1000000) {
            tax = (income * 20) / 100;
            System.out.println("You have to pay 20% tax, your income after tax = " + (income - tax));
        } else if (income > 1000000) {
            tax = (income * 30) / 100;
            System.out.println("You have to pay 30% tax, your income after tax = " + (income - tax));
        }
    }
}
