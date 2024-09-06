//package STACKDS;
import java.util.*;
class Stringreverse{
    char stack[]=new char[20];
    int top=-1;
    void push(char ele){
        if(top==stack.length-1){
            System.out.println("Stack overflow");
        }
        else{
            stack[++top]=ele;
            System.out.println(ele+" "+"pushed successfully");
            top=top++;            
        }
    }
    char pop(){
        int temp=this.top;
        if(temp==-1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            temp=top--;
            return stack[temp];
        }

    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            String inp=sc.nextLine();
            Stringreverse sr=new Stringreverse();
            char[] ele=inp.toCharArray();
            int i=0;
            String result=" ";
            for(i=0;i<ele.length;i++){
                sr.push(ele[i]);
            }
            while(sr.top!=-1){
                result = result +sr.pop();
            }
            System.out.println("Reverse string:"+" "+result);
            sc.close();
        }
    }
}

