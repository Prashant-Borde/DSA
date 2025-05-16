num=int (input("Enter a no : "))
# make a nested loop which will print diamond
for i in range(num):
    for j in range (num-i):
        print(" ",end="")
    for j in range (i*2-1):
            print("*",end="")
    print("\n")
for num in range(i):
    for j in range (num-i):
        print(" ",end="")
    for j in range (i*2-1):
            print("*",end="")
    print("\n")
        
    
    
    public static void subarray(int arr[]){
    int sumofarray[];
    for(int i=0;i<arr.length;i++){
        int sum=0,min=arr[i],max=arr[0];
        for(int j=i;j<arr.length;j++){
            // System.out.print(" ( ");
            for(int k=i;k<j;k++){
                System.out.print(arr[k]+" ,");
                sum=arr[k]+sum;
                min=Math.min(sum,min);
                max=Math.max(sum,max);
            }
            System.out.print("sum = "+sum);
            System.out.println();
            // System.out.print(" )");
        }
        System.out.print("min = "+min);
        System.out.print(" max = "+max);
        System.out.println();
        System.out.println();
    }    
}