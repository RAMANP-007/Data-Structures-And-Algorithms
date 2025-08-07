package arrays;

public class twice {

    public static boolean calculateTwice(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,1};

        boolean result = calculateTwice(arr);
        System.out.println("Contains duplicate: " + result);
    }
}
