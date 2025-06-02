import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
         
        // factorial calculate
        int fac=1;
        for(int i =1;i<=num;i++){
            fac=fac*i;
            System.out.println(fac+"*"+i);
        }
        System.out.println("Factorial = "+fac);
        sc.close();
    }
    
}
