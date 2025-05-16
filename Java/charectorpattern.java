import java.util.*;
public class charectorpattern {
    public static void main(String[] args) {
        System.out.println("        \n\nCharector Patter\n\n"); 
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
