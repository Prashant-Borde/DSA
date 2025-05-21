import java.util.*;
public class _1LinearSearch{
    public static int linearsearch (int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return(i);
            }
        }
        return -1;
    }
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Size of Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("What you want to Search : ");
    int key=sc.nextInt();
    key=linearsearch(arr,key);
    if(key==-1){
        System.out.println("Key Not Found");
    }else{

        System.out.println("Your Key found at : "+ key);
    }
    sc.close();
}
}