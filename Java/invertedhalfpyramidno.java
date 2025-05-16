import java.util.*;
public class invertedhalfpyramidno {
    public static void invertednopyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do{
            System.out.print("Enter a no. ");
            int num=sc.nextInt();
            invertednopyramid(num);
            System.out.println("want more then press 1");
            flag=sc.nextInt();

        }while(flag==1);
    }
}
