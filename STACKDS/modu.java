import java.util.Scanner;
public class modu {
    public static void main(String[] args){
        int x;
        System.out.println("enter the value of x");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        if(x%2==0){
            System.out.println("x is an even number");
        }
        else{
            System.out.println("x is an odd number");
        }
        sc.close();
    }
    
}
