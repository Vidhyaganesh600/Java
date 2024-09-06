package Sdp;
import java.util.Scanner;
import java.util.Arrays;
public class pg17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int temp;
        System.out.print("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>=arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
