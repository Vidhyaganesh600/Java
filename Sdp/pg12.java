package Sdp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class pg12 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int s = 5;
        List<int[]> result= getPairs(arr,s);
            for(int[] a:result)
                System.out.println("Pair: " + a[0]+ " "+a[1]);
    }
    public static List<int[]> getPairs(int[] arr,int s){
        Arrays.sort(arr);
        List<int[]> result = new ArrayList<>();
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==s){
                result.add(new int[] {arr[j]});
                i++;
                j--;
            }
            else if(arr[i] + arr[j]>s)
                j--;
            else if(arr[i]+arr[j]<s)
                i++;
        }
        return result;
    }
}
