import java.util.*;
public class _5reverseArray {
    public static int [] reversearray(int arr[]){
        int start=0,end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();

        // take a input of array
        int arr[] = new int [size];
        for(int i=0;i<size;i++){
            System.out.print(i+" = ");
            arr[i] = sc.nextInt();
            System.out.println();

        }

        arr = reversearray(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
           

        }
        sc.close();
    }
}
