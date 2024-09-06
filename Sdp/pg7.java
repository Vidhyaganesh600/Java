package Sdp;
import java.util.Scanner;
public class pg7 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividing number");
        n=sc.nextInt();
        System.out.println("Enter the range upto which the numbers need to be looped");
        m=sc.nextInt();
        System.out.println(differenceofSum(n,m));
        sc.close();
    }
    public static int differenceofSum(int n ,int  m){
        int sumnd=0;
        int sumd=0;
        for(int i=1;i<=m;i++){
            if(i%n!=0){
                sumnd=sumnd+i;
            }
            else{
                sumd=sumd+i;
            }
        }
        return sumnd-sumd;
    }
}
