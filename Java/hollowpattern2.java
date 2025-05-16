
import java.util.*;
public class hollowpattern2 {
    public static void hollowpattern(int n){

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("-");
            }
            for(int j=1;j<=n;j++){
                if(i==1||j==1){
                    System.out.print("*");
                }
                else if(i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1){
                    System.out.print("*");
                }
                else if(i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1){
                    System.out.print("*");
                }
                else if(i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print("-");
            }
            for(int j=1;j<=n;j++){
                if(i==1||j==1){
                    System.out.print("*");
                }
                else if(i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do{
            System.out.print("Enter a no, : ");
            int n=sc.nextInt();
            hollowpattern(n);

            System.out.println("Want more then Press 1 : ");
            flag= sc.nextInt();
        }while(flag==1);
    }
    
}
