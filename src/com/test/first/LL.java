package com.test.first;

public class LL {

    Node head;
    private int size;
    LL(){
        this.size =0;
    }

    class Node{

        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newnode = new Node(data);
        size++;
        if(head ==null){
            head =newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    public void addLast(String data){
        Node newnode = new Node(data);
        size++;
        if(head ==null){
            head =newnode;
            return;
        }

        Node nexthead = head;
        while (nexthead.next!=null){
            nexthead = nexthead.next;
        }
        nexthead.next = newnode;


    }
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode =head;
        while (currnode!=null){
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.println("NULL");

    }

    public void deleteFirst(){
        if(head ==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node lastnode = head;
        Node secondlastnode = head.next;
        while (secondlastnode.next!=null){
            secondlastnode = secondlastnode.next;
            lastnode = lastnode.next;
        }
        lastnode.next =null;
    }

    public int getSize(){

        return size;
    }

    public void reverselist(){

        if(head==null || head.next==null) {
            return;
        }
        Node prenode = head;
        Node currnode = head.next;
        while (currnode!=null){
            Node nextnode = currnode.next;
            currnode.next = prenode;

            //update
            prenode = currnode;
            currnode = nextnode;

        }
        head.next = null;
        head = prenode;
    }

    public Node reverserecursive(Node head){

        if(head ==null||head.next==null){
            return head;
        }
        Node newnode = reverserecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newnode;
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst("is");
        ll.addFirst("this");
        ll.addLast("a");
        ll.addLast("list");
        ll.print();
        System.out.println(ll.getSize());
        //ll.reverselist();
       // ll.print();
        ll.head = ll.reverserecursive(ll.head);
        ll.print();

    }

}
