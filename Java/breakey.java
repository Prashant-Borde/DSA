import java.util.*;
public class breakey {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Enter a no. : ");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
        }while(true);
    }
    
}
