import java.util.*;
public class basicFinance {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        //Pricing of the product
        System.out.println("    Bill    ");
        System.out.println("    Price \nPencil : 10\nPen : 15 \nEraser : 5");
        
        // Taking input how much product want 
        System.out.println("Pencil : ");
        int pencil = sc.nextInt();
        System.out.println("Pen : ");
        int pen = sc.nextInt();
        System.out.println("Eraser : ");
        int eraser = sc.nextInt();

        //Calculation of total cost
        pencil = pencil*10;
        pen *= 15;
        eraser *= 5;
        System.out.println("Pencil : "+ pencil);
        System.out.println("Pen : "+ pen);
        System.out.println("Eraser : "+eraser);
        // Total Cost
        int total =pencil+pen+eraser;
        System.out.println("Total : "+total);

        //tax
        int tax=total*18/100;
        System.out.println("tax : "+tax);
        int aftertax = total+tax;
        System.out.println("Aftertax : "+aftertax);
    }
    
}