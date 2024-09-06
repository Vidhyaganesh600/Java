package Sdp;
import java.util.Scanner;
public class pg6 {
    public static void main(String[] args) {
        int intwalls,extwalls;
        int icost=18,extcost=12;
        double isurface,xsurface;
        double Totalcost =0;
        Scanner sc=new Scanner(System.in);
        intwalls=sc.nextInt();
        extwalls=sc.nextInt();
        for(int i=0;i<intwalls;i++){
            isurface=sc.nextDouble();
            Totalcost = Totalcost + (isurface * icost);
        }
        for(int i=0;i<extwalls;i++){
            xsurface=sc.nextDouble();
            Totalcost = Totalcost + (xsurface * extcost);
        }
        System.out.println(Totalcost);
        sc.close();
    }
    
}
