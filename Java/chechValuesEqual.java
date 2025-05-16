import java.util.*;
public class chechValuesEqual {
    public static boolean checkValues(int nums[]){
        if(nums.length>100000){
            System.out.println("maxmimum input limit is 100000");
        }
  
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int arr[]={1,  5, 3, 4, 9, 2, 8, 7};
       boolean checked= checkValues(arr);
        if(checked==true){
            System.out.println("this is a Equal values ");
        }else{
            System.out.println("this is not a Equal Values");
        }
    }
}

// 1234
// 1231
