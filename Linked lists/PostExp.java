/*import java.util.*;
public class PostExp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Postfix evaluation:");
        System.out.println("Enter the postfix Expression:");
        String exp=sc.nextLine();
        System.out.println("The postfix expression is:"+" "+postfixeval(exp));
        System.out.println(postfixeval(exp));
        sc.close();
    }
    static int postfixeval(String exp){
        Stack stk=new Stack();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isSpaceChar(c))
                continue;
            else if(Character.isAlphabetic(c)){
                System.out.println("Expression should contain only digits");
                System.exit(0);
            }
            else if(Character.isDigit(c)){
                int num = 0;
                while(Character.isDigit(c)){
                    num=num*10+(int)(c-'0');
                    i++;
                    c=exp.charAt(i);
                }
                i--;
                stk.Push(num);
            }
            else{
                int val1=stk.pop();
                int val2=stk.pop();
                switch(c){
                    case '+':   stk.Push(val2+val1);
                                break;
                    case '-':   stk.Push(val2-val1);
                                break;
                    case '*':   stk.Push(val2*val1);
                                break;
                    case '/':   stk.Push(val2/val1);
                                break;

                }
            }
        }
        return stk.pop();

    }

}
class Stack{
    class Node{
        int data;
        Node link;
        Node(int d){
            data=d;
            link=null;
        }
    }
    Node top;
    Stack(){
        top=null;
    }
    void Push(int d){
        Node node=new Node(d);
        node.link=top;
        top=node;
    }
    int pop(){
        int ele=-1;
        if(isEmpty())
            return ele;
        else if(top!=null){
            ele=top.data;
            top=top.link;
            return ele;
        }
        else{
            top=null;
            return ele;
        }
    }
    int peek(){
        return top.data;
    }
    boolean isEmpty(){
        return (top==null);
    }
}*/
