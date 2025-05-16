import java.util.Scanner;

public class kadanas {
    public static void kadanas(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
        }
        System.out.println(ms);
    }
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Area : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        kadanas(arr);

    }
}
