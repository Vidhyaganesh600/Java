import java.util.*;
public class DLL {
    static class Node{
        String data;
        Node llink;
        Node rlink;
        Node(String d){
            data=d;
            rlink=llink=null;
        }
    }
    static Node head;
    Node temp=null;
    DLL(){
        head=null;
    }
    static Scanner sc=new Scanner(System.in);
    public void input(int i){        
        System.out.println("Enter the data");
        String data=sc.nextLine();
        data=sc.next();
        Node newNode=new Node(data);
        if(i==0){
            //newNode.llink=head;
            head=newNode;
            temp=head;
            System.out.println("while is executed");
        }
        else{
            newNode.llink=temp;
            temp.rlink=newNode;
            temp=temp.rlink;
        }                           
    }
    public static void main(String[] args){
        DLL dl=new DLL();
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            dl.input(i);
        }
        System.out.println("My Best brother:"+head.data);
        System.out.println("My trustworthy friend:"+head.rlink.data);
        System.out.println("My caring friend:"+head.rlink.rlink.data);
        sc.close();

    }
}
/**import java.util.*;

class Node {
    String data;
    Node llink;
    Node rlink;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data ");
        data = sc.nextLine();
        sc.close();
        // rlink = llink = null;
    }
}

public class DLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        Node head = null;
        Node temp = head;
        Node[] newnode = new Node[n];
        for (int i = 1; i < n; i++) {
            newnode[i] = new Node();
        }
        for (int i = 1; i < n; i++) {
            newnode[i].input();
            if (i == 1) {
                newnode[i].llink = head;
                head = newnode[i];
                temp = head;
            } else {
                newnode[i].llink = temp;
                temp.rlink = newnode[i];
                temp = temp.rlink;
            }
            System.out.println(temp.data);

        }

        sc.close();
    }
}*/

