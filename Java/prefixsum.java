import java.util.*;
public class prefixsum {
    public static void prefixsum(int arr[]){
        int newarr[]=new int[arr.length];
        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
            //modify prefix by adding a new prefix value into it using i 
            prefixsum+=arr[i];
            //added a prefix array first so it can fill the first integer 
            newarr[i]=prefixsum;
            System.out.print(prefixsum);
        }

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int pregix[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
          int start=i;
    
    
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
    
                    //printing subarray
                    System.out.print(arr[k]+" ,");
                    sum=arr[k]+sum;
    
                }
                int end=j;
              currsum=start==0?newarr[end]: newarr[end]-newarr[start-1];
              System.out.println();
    
              if(maxsum<currsum){
                maxsum=currsum;
              }
                
    
            }
           
        }    
        System.out.println("Max Sum : "+maxsum);
        // for (int num : newarr) {
        //     System.out.print(num + " ");  // Output: 1 2 3 4 5
        // }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Area : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        prefixsum(arr);

    }
}
