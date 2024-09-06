import java.util.Scanner;
public class Town {
    public static String townname(String tn[]){
        String answer="";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String townpeople[]=new String[n];
        for(int i=0;i<n;i++){
            townpeople[i]=sc.next();
        }
        String result=townname(townpeople);
    }
}
