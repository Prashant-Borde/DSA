import java.util.Scanner;

public class pairsArray {
    
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i!=j){
                    System.out.print("("+arr[i]+"-"+arr[j]+")");
                }
            }
            System.out.println();
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
        pairs(arr);
    }
}
