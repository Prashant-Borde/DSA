import java.util.*;
public class invertedhalfpyramid{
    public static void triangle(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int flag=0;
    do{
        System.out.print("Enter a No. : ");
        int num=sc.nextInt();
        triangle(num);
        System.out.println("Want more then press 1");
        flag=sc.nextInt();
    }while(flag==1);
}
}