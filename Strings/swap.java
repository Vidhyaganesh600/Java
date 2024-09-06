package Strings;
import java.util.*;
public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a + " " + b);
        //Logic 1 After Swapping

        /*int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);*/

        //Logic 2 without using 3rd variable + and -

        /*a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);*/

        //Logic 3 without using 3rd variable * and /
        //a and b must be nonzeroes

        /*a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);*/

        //Logic 4 using Bitwise XOR operator
        /*a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);*/

        //Logic 4 using Single statement
        b = a+b - (a=b);
        System.out.println(a+" "+b);
        
    }
}
