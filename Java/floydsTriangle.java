import java.util.Scanner;

public class floydsTriangle{
    public static void floyds(int num){
        int count=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do{
            System.out.print("Enter  a No. : ");
            int num=sc.nextInt();
            floyds(num);
            System.out.println("Want more then press 1");
            flag=sc.nextInt();

        }while(flag==1);
    }
}