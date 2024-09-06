package Sdp;
import java.util.Scanner;
public class pg1 {
    int a=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        pg1 p=new pg1();
        String result=p.moveHypones(str);
        System.out.println(result);
        sc.close();
    }
    private String moveHypones(String str){
        StringBuilder hyphon = new StringBuilder();
        StringBuilder result= new StringBuilder();
        if(str==null){
            return null;
        }
        for(int i=0; i< str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='-'){
                hyphon.append(ch);
            }
            else
                result.append(ch);
        }
        result.insert(0,hyphon.toString());
        return result.toString();
    }
}
