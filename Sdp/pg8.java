package Sdp;

import java.util.Scanner;

public class pg8 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enetr the value of n: ");
        int n= scn.nextInt();
        System.out.println("Enter the num value: ");
        int num=scn.nextInt();
        pg8 base = new pg8();
        String result = base.dectoNBase(n, num);
        System.out.println(result);
        scn.close();
    }
    private String dectoNBase(int n, int num){
        if(n<= 1 || n>36){
            return "Invalid";
        }
        StringBuilder result = new StringBuilder();
        while(num > 0){
            int rem=num%n;
            result.insert(0, getChar(rem));
            num/=n;
        }
        return result.toString();
    }
    private char getChar(int rem){
        if(rem > 9){
            return (char)(rem - 9 + 64);
        }
        else{
            return (char)(rem + '0');
        }
    }
}
