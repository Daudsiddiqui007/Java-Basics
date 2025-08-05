import DemoPkg.MaxelementFromArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
       int [] arr ={3,8,1,70,9,10};
       int max = MaxelementFromArray.maxElement(arr);
        System.out.println("The max element is :"+ max);
    }
}