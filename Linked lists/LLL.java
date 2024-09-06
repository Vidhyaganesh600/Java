/*class LLL{
    
    class Node{
        int data;
        Node link;
        Node(int d){
            data=d;
            link=null;
        }
    }
    Node head=null;
    public static void main(String[] args){
    LLL LL=new LLL();    
    Node newnode=LL.new Node(2);
    Node second=LL.new Node(3);
    Node third=LL.new Node(4);
    LL.head=newnode;
    newnode.link=second;
    second.link=third;
    System.out.println(LL.head.link.data);    
    }
}*/
class LLL{
    class Node{
        String data;
        Node link;
        Node(String d){
            data=d;
            link=null;
        }
    }
    Node head=null;
    public void addFirst(){
        Node newnode=new Node("Friends forever:");
        if(head==null){
            newnode=head;
            return;
        }
        else{
        newnode.link=head;
        head=newnode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node temp=head;
            while(temp.link!=null){
                System.out.println(temp.data);
                temp=temp.link;
            }
        }
    }
    public void search(String key){
        if(head==null){
            System.out.println("List is Empty");
        }    
        else{
            Node temp=head;
            int count=1;
            while(temp.link!=null){
                if(temp.data==key){
                    System.out.println(key+" "+"found at node:"+" "+count);
                    return;
                }
                temp=temp.link;
                count++;
            }

        }         
    }
    public static void main(String[] args){
        LLL LL=new LLL();       
        Node First=LL.new Node("Ankush");
        Node second=LL.new Node("Vignesh");
        Node third=LL.new Node("Pinta ram");
        Node fourth=LL.new Node("Ganesh");
        Node fifth=LL.new Node("Vivek");
        Node sixth=LL.new Node("Harshit");
        LL.head=First;
        First.link=second;
        second.link=third;
        third.link=fourth;
        fourth.link=fifth;
        fifth.link=sixth;
        LL.addFirst();
        String key="Vivek";       
        LL.display();
        System.out.println("To search"+" "+key+" "+"in the linkedlist");
        LL.search(key);
    }
    
}