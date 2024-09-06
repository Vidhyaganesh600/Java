/*import java.util.*;
public class BSTApp {
    class Node{
        int[] data;
        Node left;
        Node right;
        Node(int[] d){
            data=d;
            left=right=null;
        }
    }
    private Node root;
    private Node insert(Node r,int data){    
        if(root==null){
            root=new Node(data);
            return root;
        }
        else if(data<root.data)
            root.left=insert(root.left,data);
        else if(data>root.data)
            root.right=insert(root.right,data);
        return root;
    }
    void inorder(Node root){
        if(root==null){
            System.out.println("Tree is Empty");
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BSTApp t=new BSTApp();
        Randomno rand=new Randomno();
        //Random rd=new Random();
        System.out.print("Enter the number of nodes into the binary search tree:"+" ");
        int n=sc.nextInt();
        int[] res;
        res=rand.randomNumbers(n, maxRange)
        for(int i=0;i<n;i++){
            root=rand.result[i];
        }
        //Node newnode[]=new Node[n];
        Node newNode=null;;
        Node ro;
        for(int i=0;i<n;i++){
            ro=t.insert(newNode,rd.nextInt(10,99));
            t.inorder(ro);
        }
        
        sc.close();
    }
}
class Randomno{
    static final Random gen =new Random();
    static int[] random;
    {
        random=randomNumbers(30,100);
    }
    static int[] randomNumbers(int n,int maxRange){
        int[] result=new int[n];
        Set<Integer> used=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int newRandom;
            do{
                newRandom=gen.nextInt(maxRange+1);
            }while(used.contains(newRandom));
            result[i]=newRandom;
            used.add(newRandom);
        }
        return result;
    }
}*/
/*import java.util.*;
class BST{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    private Node root;
    private Node insert(Node k,int d){
        if(k==null){
            k=new Node(d);
        }    
        else if(d<k.data)
            k.left=insert(k.left,d);
        else if(d>k.data)
            k.right=insert(k.right,d);    
        return k;
        
    }
    
    
}*/
