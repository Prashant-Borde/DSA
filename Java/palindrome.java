import java.util.*;
public class palindrome {
    public static boolean ispalindrome(int n){
        int reverse=0;
        int copy=n;

        // loop to check plaindrome or not 
        while(copy>0){
            reverse=reverse*10+copy%10;
            System.out.println(reverse);
            copy/=10;
        }

        // check if reverse is equals to actual or not 
        return reverse==n;
          
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("        \n\nPalindrome No.\n\n");

        //taking input of palindrome
        System.out.println("Enter a no. : ");
        int num=sc.nextInt();

        //calling the method 
        boolean ispalindrome=ispalindrome(num);

        //logic to chechk palindrome
        if(ispalindrome){
            System.out.println("This is a Palindrome No.");
        }else{
            System.out.println("This is not a Palindrome No.");
        }
        sc.close();
    }
    
}
