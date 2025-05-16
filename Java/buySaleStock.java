import java.util.*;
public class buySaleStock {
    public static void buySale(int price[]){
        // int buyingPrice=Integer.MAX_VALUE;
        int buyingPrice=price[0];
        int currentProfit=0;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(price[i]>buyingPrice){
                currentProfit=price[i]-buyingPrice;
                maxProfit=Math.max(maxProfit, currentProfit);

            }
            else{
                buyingPrice=price[i];
            }
            System.out.println("Maximum Profit : "+maxProfit);
            System.out.println("Buying Price : "+buyingPrice);
        }
    }
    public static void main(String[]args){
        // System.out.print("Enter Price :");
        int arr[]={7,1,5,3,6,4};
        buySale(arr);
    }
}
