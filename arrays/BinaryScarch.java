package arrays;

public class BinaryScarch {

    public static int Bscarch(int students[], int key) {
      int start = 0;
      int end = students.length - 1;
      while (start <= end) {
        int mid = (start + end) / 2 ;
        if (students[mid] == key) {
           return mid;
        } if(students[mid] > key) {
            end = mid - 1;
        } if (students[mid] < key) {
            start = mid + 1;
        }
       }
       return -1;
    }
   
    
  public static void main(String[] args) {
   int students[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
   int key = 14;
   System.out.println("the key was found at index :" + Bscarch(students, key));
  }
 
}
