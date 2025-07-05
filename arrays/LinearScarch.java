package arrays;

public class LinearScarch {

    public static void LinearSearch(int number[]) {
        int key = 10;
        boolean found = false;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                System.out.println("The key " + key + " was found at index " + i);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("The key " + key + " was not found");
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12};
        LinearSearch(number);
    }
}
