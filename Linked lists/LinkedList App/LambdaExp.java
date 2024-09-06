import java.util.*;
interface Arithmetic{
    int operation(int a,int b);
}
public class LambdaExp {
    public static void main(String args[]){
        int x,y;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two operands:");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Arithmetic operations:");
        Arithmetic addition=(int a,int b)->(a+b);
        Arithmetic subtraction=(int a,int b)->(a-b);
        Arithmetic multiplication=(int a,int b)->(a*b);
        Arithmetic division=(int a,int b)->(a/b);
        System.out.println("Addition="+addition.operation(x, y));
        System.out.println("subtraction="+subtraction.operation(x, y));
        System.out.println("multiplication="+ multiplication.operation(x, y));
        System.out.println("division="+division.operation(x, y));
        sc.close();
    }   
}
