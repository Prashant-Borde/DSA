import java.util.*;
public class _6pairsArray {
    public static void pairsArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print( "(" + arr[i] + "," + arr[j]+")");
            }
            System.out.println();
        }
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

        // call function for printing pairs of array
        pairsArray(arr);
    }
}
