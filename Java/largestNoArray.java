import java.util.Scanner;

public class largestNoArray {
    public static int largestNoArray(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
 public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largestNo=(largestNoArray(arr));
        System.out.println("largest no. of Array is : "+largestNo); 

        int min=Integer.MIN_VALUE;
        System.out.println(min);


       
        sc.close();
    }    
}
