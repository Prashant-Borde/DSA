import java.util.Scanner;

public class subarray {
    
public static void Subarray (int arr[]){

    //nested loops because performing subarray 
    for(int i=0;i<arr.length;i++){
        
        //intitalising minimum maximum values 
        int min=arr[i],max=arr[i];


        for(int j=i;j<arr.length;j++){

            int sum=0;
            for(int k=i;k<=j;k++){

                //printing subarray
                System.out.print(arr[k]+" ,");
                sum=arr[k]+sum;

            }
            //comparing minimum and maximum values
            min=Math.min(sum,min);
            max=Math.max(sum,max);

            //printing sum
            System.out.print("sum = "+sum);
            System.out.println();

        }
        //Printing minimum and maximum values
        System.out.print("min = "+min);
        System.out.print(" max = "+max);

        System.out.println();
        System.out.println();
    }    
}
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input of size
        System.out.print("Size of Aray : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        //taking input of array
        for(int i=0;i<size;i++){
            System.out.print(i+" = ");
            arr[i]=sc.nextInt();
        }

        //calling subarray
        Subarray(arr);
        sc.close();
    }
}

