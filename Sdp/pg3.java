package Sdp;
import java.util.Arrays;
public class pg3 {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 6,8,4,5,2,3};
        int size=intArray.length;
        Arrays.sort(intArray); 
        System.out.println(Arrays.toString(intArray));
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<size; i++){
            if(i%2==0){
                num1 = num1*10 + intArray[i];
            }
            else{
                num2 = num2*10 + intArray[i];
            }
        }
        System.out.println("Number1: "+num1);
        System.out.println("Number2: "+num2);
        System.out.println("Minimum Sum : "+(num1+num2));
    }
}
