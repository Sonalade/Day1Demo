package ClassExample;

import java.util.Scanner;

public class LinkListExample {
    static class Node{
        int node;
        Node next;
        Node(int data){
            this.node=data;
            this.next=null;
        }
    }
    Node head=null;
    public void Creation(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
            }
            else {
                new_node.next=head;
                head=new_node;
            }
            System.out.println("do you want to add more data. if yes;press 1");
            n=sc.nextInt();
        }
        while (n==1);
    }
    public void display(){
        Node temp=head;
        if (head==null){
            System.out.println("ll does not exist");
        }
        else{
            while (temp!=null){
                System.out.println(temp.node);
                temp=temp.next;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the data: ");
        LinkListExample LL=new LinkListExample();
        LL.Creation();
        LL.display();

    }
}
