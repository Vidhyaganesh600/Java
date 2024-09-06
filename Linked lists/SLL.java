import java.util.Scanner;
public class SLL {
    static class Node{
        String data;
        Node llink;
        Node rlink;
        Node(String d){
            data=d;
            rlink=llink=null;
        }
    }
    Node head;
    Node temp;
    SLL(){
        head=null;
    }
    public void input(String data){
        Node newNode=new Node(data);
        while(head==null){
            newNode.llink=head;
            head=newNode;
            temp=head;
            System.out.println("while is executed");
            break;
        }
        newNode.llink=temp;
        temp.rlink=newNode;
        temp=temp.rlink;  
    }
    public static void main(String[] args){
        SLL sll=new SLL();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes");
            int n=sc.nextInt();
            String[] data=new String[n];
            int i=0;
            for(i=0;i<n;i++){
                System.out.println("Enter the data in the node");
                data[i]=sc.nextLine();
                data[i]=sc.next();
            }
            while(i<n){
                sll.input(data[i]);
                i++;
            }
            System.out.println("Head node:"+sll.head.data);
            sc.close();
        }
    }
}
