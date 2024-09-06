import java.util.Scanner;
public class Program3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Stack using array:");
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        StackApp stk=new StackApp(size);
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
                        int ele=sc.nextInt();
                        stk.push(ele);
                        break;
                case 2: int elem=stk.pop();
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
class StackApp{
    int[] arr;
    int top;
    int capacity;
    StackApp(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int ele){
        if(isFull())
            System.out.println("Stack Overflow");
        else
            arr[++top]=ele;  
            System.out.println(ele+" "+"pushed successfully");      
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int ele=arr[top--];
            return ele;
        }
    }
    void peek(){
        if(isEmpty())
            System.out.println("Stack underflow");
        else
            System.out.println(arr[top]);
    }
    void display(){
        if(isEmpty())
            System.out.println("Stack underflow");
        else
            for(int i=top;i>-1;i--)
                System.out.println(arr[i]+" ");
    }
    boolean isEmpty(){
        return (top==-1);
    }
    boolean isFull(){
        return (top==capacity-1);
    }
}
