package ClassExample;

public class ReverseList {
    class Node{
        int data;
        Node next;

         Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     Node head=null;
     Node tail=null;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void ReverseList(Node current){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        else {
            if (current.next==null){
                System.out.println(current.data+ " ");
                return;
            }
            ReverseList(current.next);
            System.out.println(current.data+" ");
        }
    }
    public void Display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while (current!=null){
            System.out.println(current.data+ " ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseList rList=new ReverseList();
        rList.addNode(1);
        rList.addNode(2);
        rList.addNode(3);
        rList.addNode(4);
        System.out.println("Original List");
        rList.Display();
        System.out.println("Reverse List");
        rList.ReverseList(rList.head);
    }
}
