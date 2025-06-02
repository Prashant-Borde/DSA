import java.util.*;
public class primeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int flag=0;
        do{
            System.out.println("Two Different aproach");
            int approach=sc.nextInt();
            switch(approach){
                case 1 :
                System.out.print("Enter a no. : ");
                int num=sc.nextInt();
                int itr=0;
                for (int i=0; i<num; i++){
                    int mul = i*(num-i);
                    System.out.println("i"+i+" num"+(num-i)+" mul"+mul);
                    if(mul==num){
                        itr++;
                        System.out.println("itr"+itr);
                        if(itr==3){
                            break;
                        }
                    }
                }
                if(itr>2){
                    System.out.println("This is not a Prime No.");
                }
                else{

                    System.out.println("This is a Prime No.");
                }
                System.out.println("want to know more prime No. ? Press 1");
                flag=sc.nextInt();
                break;

                case 2:
                System.out.print("Enter a no. : ");
                num=sc.nextInt();
                if(num==2){
                    System.out.println("this is a Prime No.");
                }
                else{
                    boolean prime=true;
                    for (int i=2;i<num;i++){
                        if(num%i==0){
                            prime=false;
                        }
                    }
                    if(prime==true){
                        System.out.println("this is a Prime No.");
                    }
                    else{
                        System.out.println("this is not a Prime No.");
                    }
                }
                break;
            }
            System.out.println("want to know more prime No. ? Press 1");
            flag=sc.nextInt();
        }while(flag==1);
        sc.close();
    }
}
