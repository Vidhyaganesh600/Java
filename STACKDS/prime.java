import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int a[],i,n,x,j,count;
        boolean flag;
        n=sc.nextInt();
        a=new int[n];
        count=0;
        System.out.println("Enter the elements into the array");
        for(i=0;i<a.length;i++){
            a[i]=i;
            x=a[i];
            flag=true;
            if(x<=1){
                continue;
            }
            for(j=2;j<=x/2;j++){
                if(x%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println(" "+x);
            }
        } 
        System.out.println("the number of prime numbers are"+" "+ count);
        sc.close();  
        }
        
    }    

