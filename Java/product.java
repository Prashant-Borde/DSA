import java.util.*;
public class product {
    public static int productfun(int a , int b){
       int product=a*b;
       return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // input code
        System.out.print(" Enter A : ");
        int a = sc.nextInt();
        System.out.print(" Enter B : ");
        int b = sc.nextInt();
        int product=productfun(a, b);
        System.out.println("Product : "+product);
    }
}
