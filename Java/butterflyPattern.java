import java.util.*;
public class butterflyPattern {
    public static void butterflyPattern(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }
            // for(int j=1;j<=num-i;j++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }
            // for(int j=1;j<=num-i;j++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do{
            System.out.println("Enter a no. : ");
            int num=sc.nextInt();
            butterflyPattern(num);
            System.out.println("press 1 for more ");
            flag=sc.nextInt();

        }while(flag==1);
        sc.close();
    }
}
