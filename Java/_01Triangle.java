import java.util.*;
public class _01Triangle {
    public static void _01Triangle(int num){
        int counter=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");

                }
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print( "Enter a no.");
            int num=sc.nextInt();
            _01Triangle(num);
            System.out.println("Want more then press 1");
            flag=sc.nextInt();
        }while(flag==1);
    }
}
