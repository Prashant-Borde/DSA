import java.util.Scanner;

public class rainwater{
 
    public static void rainwater(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        int min[]=new int[arr.length];
        int sum=Integer.MIN_VALUE;
        int n=arr.length;

        //loop array from left to right and find maximum 
        System.out.println("left    : ");
        for (int i=0;i<n;i++){
            sum=Math.max(sum, arr[i]);
            left[i]=sum;
            System.out.print(left[i]);
        }
        System.out.println();

        //loop array from right to left and find maximum
        System.out.println("right   :");
        sum=arr[n-1];
        for (int i=0;i<n;i++){
            sum= Math.max(sum, arr[n - 1 - i]);
            right[n - 1 - i] =sum;
            // System.out.print(sum);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(right[i]);
        }
        System.out.println();
        
        //find minimum of both array 
        System.out.println("minimum : ");
        for (int i=0;i<n;i++){
            sum=Math.min(left[i], right[i]);
            min[i]=sum;
            System.out.print(min[i]);
        }
        System.out.println();
        
        
        //substract from actual array
        System.out.println("final   : ");
        sum=0;
        for (int i=0;i<n;i++){
            arr[i]=min[i]-arr[i];
            System.out.print(arr[i]);
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("Rainwater Traped is "+sum);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Area : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        rainwater(arr);
        sc.close();

    }
}


// 2 1 3 1 2 4
// 2 2 3 3 3 4 left
// 4 4 4 4 4 4 right
// 2 2 3 3 3 4 min
// 0 1 0 2 1 0=4
// 4206325
// 4446666 left
// 



//                |
//       |        |
// |     |     |  |
// |  |  |  |  |  |