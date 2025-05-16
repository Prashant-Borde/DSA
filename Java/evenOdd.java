import java.util.*;
public class evenOdd {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("How many no. you want");
    int itr=sc.nextInt();
    int evenSum = 0;
    int oddSum = 0;

    //input number
    for(int i=0;i<itr;i++){
        System.out.print("Enter a No. : ");
        int num=sc.nextInt();
        if(num%2==0){
            evenSum+=num;
        }
        else{
            oddSum+=num;
        }
    }
    System.out.println("Sum of Even No. : "+ evenSum);
    System.out.println("Sum of odd No. : "+ oddSum);

}
    
}
