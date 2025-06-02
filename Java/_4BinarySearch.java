import java.util.*;
public class _4BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid; // key found
            } else if (key > arr[mid]) {
                start = mid + 1; // search in right half
            } else {
                end = mid - 1; // search in left half
            }
        }

        return -1; // key not found
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         //Take Size of a array as input 
         System.out.print("Enter Size :");
         int size=sc.nextInt();
     
         //input array
         int[]arr=new int[size];
         for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
         }

         //take a key as an Input 
         System.out.print("Enter a Key you want to find : ");
         int key = sc.nextInt();
         

         //Call Binary Search Function
         int result=binarySearch(arr, key);
         if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }

        sc.close();
    }
}
