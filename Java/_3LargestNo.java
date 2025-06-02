import java.util.*;
public class _3LargestNo {
public static int largestNo(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if (arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        //Take Size of a array as input 
        System.out.print("Enter Size :");
        int size=sc.nextInt();
    
        //input array
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest NO. is : "+largestNo(arr));
        sc.close();
    }
}
