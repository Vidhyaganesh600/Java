import java.util.*;
public class generic {
    public static<T> int genericMethod(ArrayList<T>list){
        int count=0;
        for(int i=0;i<list.size();i++){
            if((int)list.get(i)%2!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println("The number of odd numbers in array collection list is:"+" "+genericMethod(list));
        sc.close();
    }
    
}
