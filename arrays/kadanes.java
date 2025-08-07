package arrays;

public class kadanes {

    public static void KadanesAlgo(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum Subarray Sum using Kadane's Algorithm: " + ms);
    }
    

    public static void main(String[] args) {
        int arr[] = {2, -1, 3, 4};
        KadanesAlgo(arr);
    }
}

