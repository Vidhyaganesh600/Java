import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=1;i<=n;i++){
            a[i-1]=i;
        }
        for(int i=1;i<n;i++){
            if(a[i]!=0){
                for(int j=i+a[i];j<n;j+=a[i]){
                    a[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}
