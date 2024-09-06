package Strings;
import java.util.Scanner;
import java.util.*;
public class palinno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);
        if(org_num==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
