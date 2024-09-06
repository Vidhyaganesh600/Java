package Strings;
import java.util.*;
public class countno {
    public static void main(String[] args) {
        int n=0123456;
        /*int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);*/

        // To count odd or even number of digits
        int even=0;
        int odd=0;
        int num=n;
        while(n>0){
            num=n%10;
            System.out.println("num "+num);
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
            n=n/10;
            System.out.println("n "+n);
        }
        System.out.println("Even "+ even +" odd "+ odd);
    }
}
