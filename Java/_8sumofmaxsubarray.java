import java.util.Scanner;

public class _8sumofmaxsubarray {
    public static void subArray(int arr[]){
        int maxsum=Integer.MIN_VALUE,minsum=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    if(sum>maxsum){
                        maxsum=sum;
                    }
                    if(sum<minsum){
                        minsum=sum;
                    }
                    System.out.print(sum+",");

                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("maxsum is : " + maxsum);
        System.out.println("maxsum is : " + minsum);
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