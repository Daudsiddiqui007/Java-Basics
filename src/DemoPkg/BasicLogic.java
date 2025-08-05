package DemoPkg;
import java.lang.*;
public class BasicLogic {
    public static int getMaxElement(int [] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    public static int getSecondMaxElement(int [] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]>max1){
                max2=max1;
                max1= arr[i];
            } else if (arr[i]<max1 && arr[i]>max2) {
               max2=arr[i];
            }
        }
        return max2;
    }
    public static void isPalindrom(int num) {
        int rev =0;
        int temp=num;
        while(num>0) {
        rev = rev*10+(num%10);
        num=num/10;
        }
        if(temp==rev) {
            System.out.println("Number is palindrom!!!");
        }
        else {
            System.out.println("Number is not palindrom!!!");
        }
    }
    public static double twoPowerSummationOfArray(int [] arr){
        double sum=0;
        for(int i=0;i<=arr.length-1;i++) {
        double m = Math.pow(2,arr[i]);
            sum += m;
        }
        return sum;
    }
    public static int twoPowerSummationOfArrayUsingBitOperator(int [] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++) {
           sum+= 1<<arr[i];
        }
        return sum;
    }
}
