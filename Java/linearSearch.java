import java.util.*;
public class linearSearch {
    public static int linearSearch(int arr[],int num){
        for(int i=0; i<arr.length;i++){
            if(num==arr[i]){
             return i;
            } 
        
        }
        return -1;
       
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("NO. you want to find");
        int find=sc.nextInt();
        int location=(linearSearch(arr, find));
        if(location==-1){
            System.out.println(" not found ");
        }else{

            System.out.println(find+" is found on "+location);
        }


       
        sc.close();
    }
    
}
