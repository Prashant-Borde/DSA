import java.util.*;
public class binaryconversion {
    public static int bnry (int n){
        int dec=0;
        int power=0;
        for(int i=1;n>0;i++){
        int lastdigit=n%10;
        System.out.println(lastdigit);
        dec=dec+(lastdigit*(int)Math.pow(2,power));
        power++;
        n=n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Binary : ");
        int num=sc.nextInt();
        int converted=bnry(num);
        System.out.println("Decimal : "+converted);


    }
}
