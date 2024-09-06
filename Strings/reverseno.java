package Strings;
import java.util.*;
public class reverseno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        /*int rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);*/

        //Using String Buffer
        /*StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println(rev);*/

        //Using String Builder
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev=sb.reverse();
        System.out.println(rev);
    }
}
