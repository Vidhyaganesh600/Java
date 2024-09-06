import java.util.*;
public class Bracket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string with  braces");
        String test=sc.nextLine();
        if(test.isEmpty())
            System.out.println("Empty String");
        else
            System.out.println(checkBalance(test));
        sc.close();
    }
    public static String checkBalance(String test){
        Stack stack=new Stack();
        for(int i=0;i<test.length();i++){
            char ch=test.charAt(i);
            //System.out.println(ch);
            if(ch=='('||ch=='['||ch=='{')
                stack.push(ch);
            else if((ch==')'||ch==']'||ch=='}')&&(!stack.isEmpty()))
                if(((char)stack.peek()=='(' && ch==')')||((char)stack.peek()=='[' && ch==']')||((char)stack.peek()=='{' && ch=='}')){
                    stack.pop();
                }
                else{
                    return "Not Balanced";
                }
            else{
                if((ch ==')' || ch==']' || ch=='}'))
                    stack.display();
                    return "Not Balanced";
            }
        }
        if(stack.isEmpty())
            return "Balanced parenthesis";
        else
            return "Not Balanced";
    }
}
class Stack{
    private Object[] arr;
    private int top=0;
    private int size;
    Stack(){
        this.size=30;
        this.arr=new Object[this.size];
    }
    public void push(Object o){
        if(top==size){
            this.increaseSize();
        this.arr[top]=o;
        System.out.println("pushed"+" "+o);
        top++;
        }
    }
    Object pop(){
        if(top!=0){
            Object obj=arr[top-1];
            this.arr[top-1]=null;
            top--;
            return obj;
        }
        else
            System.out.println("Stack Underflow");
            return null;
    }
    Object peek(){
        if(top!=0)
            return this.arr[top];
        else
            return null;
    }
    void display(){
        if(!isEmpty())
            for(int i=top-1;i!=0;i--){
                System.out.println(arr[i]+" ");
            }
        else
            System.out.println("Underflow");
    }
    boolean isEmpty(){
        return top==0 ? true:false;
    }
    int getStacksize(){
        return top;
    }
    private void increaseSize(){
        Object[] temp=new Object[size];
        size=size*2;
        int i;
        for(i=0;i<top;i++){
            temp[i]=this.arr[i];
        }
        this.arr=new Object[this.size];
        for(i=0;i<top;i++){
            this.arr[i]=temp[i];
        }
    }
}
