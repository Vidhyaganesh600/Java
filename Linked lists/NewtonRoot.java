//import java.uti.Scanner;
/*public class NewtonRoot {
    static double SquareRoot(double n,double l){
        double x=n;
        double root;
        //int count=0;
        while(true){
            //count++;
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<l)
                break;
            x=root;
        }
        return root;
    }
    public static void main(String[] args){
        double n=36;
        double l=0.00001;
        System.out.println(SquareRoot(n,l));
    }
}*/
public class NewtonRoot{
    static double SquareRoot(double n,double l){
        double x=n;
        double root;
        //int count=0;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<l)
                break;
            x=root;
        }
        return root;
    }
    public static void main(String[] args){
        double n=25;
        double l=0.00001;
        System.out.println(SquareRoot(n, l));
    }
}
