import java.util.Scanner;

public class reversearray {

    public static void Reversearray(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            System.out.print("("+start+":"+end+")");
            start+=1;
            end-=1;
            
        }
        for(int j=0;j<arr.length;j++){
            
            System.out.print(arr[j]);
        }
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
        Reversearray(arr);
        sc.close();
    }
}
