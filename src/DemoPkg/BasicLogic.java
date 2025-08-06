package DemoPkg;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

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
    public static boolean isPrime(int num){
        boolean res=true ;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static List<Integer> closestPrimeNumber(int num){
       List<Integer> li = new ArrayList<>();
        int temp1=num;
       int temp2=num;
       int count1=0;
       int count2=0;
       if(isPrime(num))
       {
           li.add(num);
           return li;
            }
       while(!isPrime(temp1)){
           temp1--;
           count1++;
       }
        while(!isPrime(temp2)){
            temp2++;
            count2++;
        }
       if(count1>count2){
           li.add(temp2);
       }
       else if(count1<count2){
           li.add(temp1);
       }
       else {
           li.add(temp1);
           li.add(temp2);
       }
       return li;
    }

    public static List<Integer> closestPrimeNumberSingleLoop(int num){
        List<Integer> li = new ArrayList<>();
        boolean left=false;
        boolean right =false;
        if(isPrime(num))
        {
            li.add(num);
            return li;
        }
        int i = 1;
       while(i<=num){
           left = isPrime(num+i);
           right = isPrime(num-i);
          if(left || right){
              break;
          }
          i++;
       }
       if(left && right){
           li.add(num-i);
           li.add(num+i);
       }
       else if(left){
           li.add(num+i);
       }
       else{
           li.add(num-i);
       }
        return li;
    }
    public static String toBinaryConvert(int num){
        String binary="";
        while(num>0){
            binary =  (num%2)+binary ;
            num /= 2;
        }
        return binary;
    }

    public static String toBinaryConvertWithBitWiseOperator(int num){
        String binary="";
        while(num > 0){
           binary = (num & 1) + binary;
           num >>= 1;
        }
        return binary;
    }
}
