import java.util.*;
public class binarySearch {
    public static void binarySearch(int arr[],int find){
        int start=0,end=arr.length-1;
       
        while(start<=end){
            int mid=(start+end)/2;
           
            //mid value is same
            if(find==arr[mid]){
                System.out.println(find+" found on "+mid+" index");
            }
            //first half
            if(arr[mid]<find){
                start=mid+1;
            }
            //Second Half
            else{
                end=mid-1;
            }
        }
        System.out.println("executed");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Aray");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            
            System.out.print(i+" = ");
            arr[i]=sc.nextInt();

        }
        System.out.print("value You want to find : ");
        int find=sc.nextInt();
        binarySearch(arr,find);
    }
}
