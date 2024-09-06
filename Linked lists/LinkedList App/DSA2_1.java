import java.util.*;
class DSA2_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        QueueLL que=new QueueLL();
        ArrayStack stk=new ArrayStack(100);
        System.out.println("Enter the number of words inside the Q");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the word");
            String str=sc.nextLine();
            str=sc.next();
            que.enqueue(str);
        }
        for(int i=1;i<=n;i++){
        String word=que.dequeue();
        for(int j=0;j<word.length();j++)
            stk.push(word.charAt(j));
        String reverse="";
        for(int k=stk.top;k>=0;k--)
            reverse=reverse+stk.pop();
        if(word.equals(reverse))
            System.out.println(word+" "+"is a palindrome ");
        else
            System.out.println(word+" "+"is not a palindrome ");
        continue;
        }
        sc.close();
    }
}
class ArrayStack{
    char[] stack;
    int top;
    int capacity;
    ArrayStack(int size){
        stack=new char[size];
        top=-1;
        capacity=size;
    }
    public boolean push(char ele){
        if(top==capacity-1)
            return false;
        else
            stack[++top]=ele;
            return true;
    }
    public char pop(){
        char ele='$';
        if(top<0)
            System.out.println("Stack underflow");
        else
            ele=stack[top--];
        return ele;        
    }
    public void printstack(){
        if(top<0)
            System.out.println("Stack is empty");
        else
            for(int i=top;i>=0;i--)
                System.out.println(stack[i]);
    }
}
class QueueLL{
    class Node{
        String data;
        Node next;
        Node temp;
        public Node(String d){
            this.data=d;
            this.next=null;
        }
    }
    private Node rear,front;
    QueueLL(){
        front=rear=null;
    }
    String dequeue(){
        if(front==rear)
            System.out.println("Q empty");
        Node temp=front;
        front=front.next;
        if(front==rear)
            rear=null;
        return temp.data;
    }
    boolean enqueue(String str){
        Node node=new Node(str);
        if(front==null){
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }
        return(rear!=null);
    }
    void printQ(){
        Node n=front;
        while(n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
}
