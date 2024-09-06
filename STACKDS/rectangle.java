import java.util.*;
public class rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rectangles");
        int n=sc.nextInt();
        int[] len=new int[n];
        int[] brd=new int[n];
        int[] are=new int[n];
        int Large=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the length");
            len[i]=sc.nextInt();
            System.out.println("enter the breadth");
            brd[i]=sc.nextInt();
            are[i]=len[i] * brd[i];
            System.out.println("Area of rectangle is "+" "+are[i]);
            }
        for(int i=0;i<n;i++){
            if(are[i]>Large){
                Large=are[i];
            }    
        }
        System.out.println("Area of Largest rectangle is:"+" "+Large);
        sc.close();    
    }
    
       
        
        
        
    
    
}
