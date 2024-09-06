import java.util.*;
public class program6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Stack using LinkedList:");
        StackLL stk=new StackLL();
        boolean flag=true;
        while(flag){
            System.out.println("1.push an ele in stack");
            System.out.println("2.pop an ele from stack");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter an element into the stack:");
                        String ele=sc.nextLine();
                        ele=sc.next();
                        stk.push(ele);
                        break;
                case 2: String elem=stk.pop();
                        System.out.println(elem+" "+"popped out");
                        break;
                case 3: stk.peek();
                        break;
                case 4: System.out.println("Stack contents are:");
                        stk.display();
                        break;
                case 5: flag=false;
                        break;
                default:System.out.println("Invalid choice try again.....");
            }
        }
        sc.close();
    }
}
class StackLL{
    class Node{
        String data;
        Node next;
        Node(String d){
            data=d;
            next=null;
        }
    }
    Node top;
    StackLL(){
        this.top=null;
    }
    void display(){
        Node n=top;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public void push(String ele){
        Node node=new Node(ele);
        node.next=top;
        top=node;
    }
    String pop(){
        String s=null;
        if(isEmpty())
            return s;
        s = top.data;
        top=top.next;
        return s;
    }
    void peek(){
        if(isEmpty())
            System.out.println("Stack underflow");
        else{
            System.out.println(top.data);
        }
    }
    boolean isEmpty(){
        return (top==null);
    }

}

