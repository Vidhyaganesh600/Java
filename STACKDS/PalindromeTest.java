import java.util.*;
class PalindromeTest{
    public static void main(String[] arg){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the string:"+" ");
        String str =in.nextLine();
        System.out.println("a.check palidrome using stack");
        System.out.println("b.check palindrome using Queue");
        System.out.println("Enter our choice:");
        String ch=in.nextLine();
        switch(ch.charAt(0)){
            case'a':
            case'A':if(usingStack(str))
                        System.out.println("the input string"+" "+str+" "+"is a palindrome");
                    else
                        System.out.println("the input string"+" "+str+" "+"is not a palindrome");
                    break;
            case'b':
            case'B':if(usingqueue(str))
                        System.out.println("the input string"+" "+str+" "+"is a palindrome");
                    else
                        System.out.println("the input string"+" "+str+" "+"is not a palindrome");
                    break;
            default:System.out.println("Invalid choice try again.....");

        }
        in.close();
    }
    static boolean usingStack(String string){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<string.length();i++)
            stack.push(string.charAt(i));
        String reverseString="";
        while(!stack.isEmpty())
            reverseString = reverseString + stack.pop();
        if(string.equals(reverseString))
            return true;
        else
            return false;            
    }
    static boolean usingqueue(String string){
        Queue<Character> queue = new LinkedList<Character>();
        for(int i=string.length()-1;i>=0;i--)
            queue.add(string.charAt(i));
        String reverseString="";
        while(!queue.isEmpty())
            reverseString = reverseString+queue.remove(); 
        if(string.equals(reverseString))
            return true;
        else
            return false;   
    }
}