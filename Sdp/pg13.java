package Sdp;
import java.util.Scanner;
public class pg13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n=sc.nextInt();
        int count=1;
        int res=1;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            res=1;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    res=res+1;
                }
                if(res==i+1){
                    count=count+1;
                }
            }    
        }
        System.out.println(count);
        sc.close();
    }
     
}
