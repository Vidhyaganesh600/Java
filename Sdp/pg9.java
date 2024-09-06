package Sdp;

import java.util.Scanner;

public class pg9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vehicles");
        int V=sc.nextInt();
        System.out.println("Enter Wheels: ");
        int W=sc.nextInt();
        int tw =0 ,fw =0;
        if(2 > W || W % 2 !=0 || V > W){
            System.out.println("Invalid input");
        }
        else{
            tw = (V*4 - W)/2;
            fw = V-tw;
        }
        System.out.println("tw= "+ tw +"fw =" + fw);
    }
}
