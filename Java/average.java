import java.util.*;
public class average {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("Enter C :");
        int c = sc.nextInt();
        int avg = a+b+c/3;
        System.out.println("Average of Three no. "+avg);
        sc.close();
    }
    
}
