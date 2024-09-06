import java.util.Scanner;
public class Condition {
    static int age;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        if(age>18){
            System.out.println("Is adult");
        }
        else{
            System.out.println("Is not adult");
        }
        sc.close();
        
    }
    
    
    
     
}
