import java.util.*;
public class Insertionsort {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
          
          int n,i;
          System.out.println("Enter the size of array");
          n=sc.nextInt();
          int[] arr=new int[n];
          System.out.println("Enter the elements into the array");
          for(i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
          }
          sor(arr);
          for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          }
          sc.close();  
    }
    public static void sor(int arr[]){
       int n=arr.length;
       int i=0;
       for(int j=1;j<n;j++){
            int key=arr[j];
            i=j-1;
            while(arr[i]>key && i>=0){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
       } 
          
    }
}
