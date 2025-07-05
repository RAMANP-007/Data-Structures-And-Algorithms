package arrays;

public class Largest {

    public static int GetLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println ("THE LARGEST NUMBER IN THE ARRAY IS :" +GetLargest(arr));
    }
}
