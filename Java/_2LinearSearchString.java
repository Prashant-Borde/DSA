import java.util.*;
public class _2LinearSearchString {
    public static int LinearSearchString(String arr[],String key){
        System.out.println("enter in function");
         for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
         }
         return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Size of Array : ");
        int size = sc.nextInt();
        String words[]=new String [size];
        for(int i=0;i<size;i++){
            words[i]=sc.next();
            System.out.println(words[i]);
        }
        System.out.println("Enter a Key to find : ");
        String key=sc.next();
        int result= LinearSearchString(words,key);
               if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found.");
        }

        sc.close();
    }
}
