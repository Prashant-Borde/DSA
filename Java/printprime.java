import java.util.*;
public class printprime {
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
               return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range : ");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            if (isPrime(i)==true){
                System.out.println("prime no. : "+i);
            }
        }

    }
}
