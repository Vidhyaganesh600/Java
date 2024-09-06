/*import java.util.*;
import java.lang.Exception;
class OddException extends Exception{
    OddException(){
        super("Odd number exception");
    }
    OddException(String msg){
        super(msg);
    }
}
public class EvenOdd {
    void halfOf(int num){
        try{
            if(num%2!=0){
                throw(new OddException());
            }
            else if(num==0){
                throw(new OddException());
            }
            else{
                System.out.println(num+" "+"is an even number and its half is:"+" "+(num/2));
            }
        }
        catch(OddException Ex){
            System.out.println("Error:"+Ex.getMessage());
        }
        System.out.println("End of program");
    }
}
class EvenOddApp{
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num");
        num=Integer.parseInt(sc.nextLine());
        EvenOdd EO=new EvenOdd();
        EO.halfOf(num);
        sc.close();
    }
}*/
import java.util.*;
import java.lang.Exception;
class OddException extends Exception{
    OddException(){
        super("Odd number Exception");
    }
    OddException(String msg){
        super(msg);
    }
}
class EvenOdd{
    void halfOf(int num){
        try{
            if(num%2!=0){
                throw(new OddException());
            }
            else if(num==0){
                throw(new OddException());
            }
            else{
                System.out.println(num+" "+"is an even number and its half is "+" "+(num/2));
            }
        }catch(OddException Ex){
            System.out.println("Error:"+" "+Ex.getMessage());
        }
        System.out.println("End of program");
    }
}
class EvenOddApp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter num");
        num=Integer.parseInt(sc.nextLine());
        EvenOdd EO=new EvenOdd();
        EO.halfOf(num);
        sc.close();
    }
}
