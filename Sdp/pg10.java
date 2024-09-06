package Sdp;

import java.util.Arrays;
import java.util.Scanner;
public class pg10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,j=0;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++)
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
                else if(j == n-1){
                    res[i]=-1;
                }
        }
        res[n-1]=-1;
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}