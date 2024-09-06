/*import java.util.*;
public class Stackarrays {
    int []S;
    int top;
    int Size;
    Stackarrays(int Size){
        S=new int[Size];
        top=-1;
    }
    void push(int ele){
        if(top==S.length-1)
            System.out.println("Stack Overflow");
        else{
            S[++top]=ele;
            System.out.println(ele+" "+"pushed successfully");
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{    
            return S[top];
        }            
    }
    void display(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            int watch=top;
            while(watch!=-1){
                System.out.println(S[watch]+" ");
                watch--;
            }
        }
    }
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Stack array");
        System.out.println("Enter the size of the array");
        int Size=read.nextInt();
        Stackarrays sc=new Stackarrays(Size);
        while(flag){
            System.out.println("1.push an ele");
            System.out.println("2.pop an ele");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Select your option:");
            int op=read.nextInt();
            switch(op){
                case 1:System.out.println("Enter the ele to push");
                       int ele=read.nextInt();
                       sc.push(ele);
                       break;
                case 2:ele=sc.pop();
                       sc.top--;
                       System.out.println(ele+" "+"Popped out of the stack");
                       break;
                case 3:sc.display();
                       break;
                case 4:flag=false;
                       break;
                default:System.out.println("Invalid choice enter again....");
            }
        }
        read.close();
    }
    
}*/
import java.util.*;
class Stackarray{
    String Stack[];
    int capacity;
    int top;
    Stackarray(int size){
        Stack=new String[size];
        capacity=size;
        top=-1;
    }
    public boolean push(String ele){
        if(isFull())
            return false;
        else{
            Stack[++top]=ele;
            return true;
        }
    }
    public String pop(){
        if(isEmpty())
            return null;
        else{
            return Stack[top--];
        }
    }
    public void Display(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            for(int i=top;i>-1;i--){
                if(Stack[i].equals("Vikki"))
                {
                    System.out.println(Stack[i]+" younger person in the Boolean.");                    
                }
                System.out.println(Stack[i]);
            }
        }
    }
    public boolean isFull(){
        return(top==capacity-1);
    }
    public boolean isEmpty(){
        return(top==-1);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        Stackarray sarr=new Stackarray(size);
        boolean flag=true;
        while(flag){
            System.out.println("1.Push an element to stack");
            System.out.println("2.Pop an element from stack");
            System.out.println("3.Display the elements of stack");
            System.out.println("4.Exit");
            System.out.print("Select your option:");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("enter the element to push");
                        String ele=sc.nextLine();
                        ele = sc.next();
                        if(sarr.push(ele))
                            System.out.println(ele+" Successfully pushed into the stack");
                        else
                            System.out.println("Stack overflow");
                        break;
                case 2: ele=sarr.pop();
                        
                        if(ele==null)
                            System.out.println("Stack underflow");
                        else
                            System.out.println(ele+" "+"popped out");
                        break;
                case 3: System.out.println("Stack elements:");
                        sarr.Display();
                        break;
                case 4: flag=false;
                        break;
                default:System.out.println("Invalid choice try again...");
            }
        }
        sc.close();
    }
}

