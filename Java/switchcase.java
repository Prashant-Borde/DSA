import java.util.*;
public class switchcase {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("        Calculator");
        
        //Input code
        System.out.println("A : ");
        float a = sc.nextInt();
        System.out.println("B : ");
        float b = sc.nextInt();

        //Opration code
        System.out.println("which Opration do you want to perform");
        String opration =  sc.next();

        switch (opration){
            case "+" : if (opration=="+");
                    System.out.println("a+b = "+(a+b));
            break;

            case "-" : if (opration=="-");
                    System.out.println("a-b = "+(a-b));
            break;
        
            case "*" : if (opration=="*");
                    System.out.println("a*b = "+(a*b));
            break;

            case "/" : if (opration=="/");
                    System.out.println("a/b = "+(a/b));
            break;

            
        }

    }
    
}
