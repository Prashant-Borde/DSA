import java.util.Scanner;

public class _7subArray {
    public static void subArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print("  ");
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
        subArray(arr);
    }
}
