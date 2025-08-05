package DemoPkg;

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
}
