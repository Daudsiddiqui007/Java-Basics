import DemoPkg.BasicLogic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//       int [] arr ={3,8,1,70,9,10};
//       int max = BasicLogic.getMaxElement(arr);
//        System.out.println("The max element is :"+ max);
//        int secondMax = BasicLogic.getSecondMaxElement(arr);
//        System.out.println("The Second max element is :"+ secondMax);
//        int n=1344301;
//        BasicLogic.isPalindrom(n);
        int [] arr ={3,4,1,2,0,0};
        int sum = BasicLogic.twoPowerSummationOfArrayUsingBitOperator(arr);
        System.out.println("The Sum of 2 to the power of element :"+ sum);

    }
}