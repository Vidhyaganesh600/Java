package Sdp;
import java.util.Scanner;
public class pg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 value...");
        int num1 = sc.nextInt();
        System.out.println("Enter num3 value...");
        int num2 = sc.nextInt();
        pg2 p=new pg2();
        int result=p.numOfCarries(num1,num2);
        System.out.println(result);
        sc.close();
    }
    private int numOfCarries(int num1, int num2){
        int carry=0;
        int countCarries=0;
        while(num1>0 || num2 >0){
            int d1=num1%10;
            int d2=num2%10;
            int sum=d1+d2+carry;
            carry=sum/10;
            if(carry>0){
                countCarries++;
            }
        }
        return countCarries;
    }
}
