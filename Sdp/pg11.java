package Sdp;
import java.util.Arrays;
import java.util.Scanner;
public class pg11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of people");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int Stephan = 0;
        int Damon=0;
        int j;
        for(int i=n-1;i>=0;i--){
            Stephan += arr[i];
            for(j=0;j<i;j++){
                Damon+=arr[j];
                if(Stephan>Damon){
                    break;
                }
                if(j==i){
                   break; 
                }
            }
            
        }
        System.out.println("Stephan=" + Stephan + " " +"Damon "+ Damon);
    }
}
/*
 * public class StephanAndDaemon{
 * public static void main(String[] args){
 * int[] arr={0,9,3,5,1,2};
 * Arrays.sort(ar);
 * int sp=0 ,dp=0 ,i=ar.length-1;
 * for(int a: ar){
 * dp+=a;
 * }
 * while(sp<dp){
 *  dp-=ar[i];
 *  sp+=ar[i];
 * i--;
 * }
 * sout("Stephan Power:" +sp);
 * sout("Damon Power:" +dp);
 * }
 * }
 */