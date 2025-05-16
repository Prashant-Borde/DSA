import java.util.*;
public class areaOfSquare {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter Side A : ");
        int side_a = sc.nextInt();
        System.out.println("Enter Side B : ");
        int side_b = sc.nextInt();
        int areaOfSquare=side_a*side_b;
        System.out.println("Area of a Square is "+ areaOfSquare);
        }

        finally {
            if (sc != null) {
                sc.close();  // Close the scanner to prevent resource leak
            }
        }

    }
    
}
