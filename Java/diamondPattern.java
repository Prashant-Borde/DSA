import java.util.*;
public class diamondPattern {
    public static void diamondPattern(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;

        do{
            System.out.print("Enter a no. : ");
            int num=sc.nextInt();
            diamondPattern(num);
            System.out.print("Press 1 for more : ");
            flag=sc.nextInt();
        }while(flag==1);
    }
}
