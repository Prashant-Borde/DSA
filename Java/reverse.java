import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int flag=0;
        do{
            try{
                System.out.println("\n\n        Reverse no.\n\n");
                System.out.print("Enter a no. : ");
                int num = sc.nextInt();
                int reverse=0;
                while(num!=0){
                    int digit =num%10;
                    reverse=reverse*10+digit;
                    num=num/10;
                    
                }
                System.out.println("Reverse : "+reverse);
                System.out.print("Want another response? Press 1 for yes: ");
                flag=sc.nextInt();
            } catch(Exception E){
                // Catch any input errors
                System.out.println("Invalid input, please enter a valid number.");
                sc.next(); // Clear the invalid input
            }
            
        }while(flag==1);    
        sc.close();
        System.out.println("Scanner closed. Goodbye!");
    }
    
}
