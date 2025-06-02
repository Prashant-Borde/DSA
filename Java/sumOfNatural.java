import java.util.*;
public class sumOfNatural {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("        \n\nSum Of N Natural Number\n\n");
        System.out.print("Enter no. : ");
        int num = sc.nextInt();
        int sum=0;
        // using fo loop 
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of Natural No. : "+sum);
        
        //using while loop 
        sum=0;
        int i=1;
        while(i<=num){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of Natural No. : "+sum);
        sc.close();
    }
    
}
