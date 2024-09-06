package Sdp;
import java.util.Scanner;
public class pg15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int even[];
        int odd[];
        System.out.println("Enter size of the array:");
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            while(i%2==0){
                even[]=arr[i];
            }
        }
    }
}
