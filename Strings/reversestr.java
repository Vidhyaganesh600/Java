package Strings;
import java.util.*;
public class reversestr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="Akash";
        int len=s.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
