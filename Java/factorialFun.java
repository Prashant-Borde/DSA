import java.util.*;
public class factorialFun {
    public static int factorial(int a){
        int fac=1;
        for(int i =1;i<=a;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter a no. : ");
        // int num= sc.nextInt();
        // int fac =factorial(num);
        // System.out.println("Factorial : "+fac);


        //binomial Coefficient
        // formula ncr= n! / r! (n-r)!
        System.out.print("Enter N : ");
        int n=sc.nextInt();
        System.out.print("Enter R : ");
        int r=sc.nextInt();
        int nfac=factorial(n);
        int rfac=factorial(r);
        int n_rfac=n-r;
        n_rfac=factorial(n_rfac);
        int ncr=nfac/(rfac*n_rfac);
        System.out.println("NCR : "+ncr);

    }
}
