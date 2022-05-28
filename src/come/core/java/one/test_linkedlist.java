package come.core.java.one;

public class test_linkedlist {

    Node head;
    class Node{

        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void print_linled_list(){
        Node n = head;
        while (!(n ==null)){
            System.out.println(n.data);
            n = n.next;
        }

    }

    public static void main(String[] args) {

        test_linkedlist tll= new test_linkedlist();

        Node first = tll.new Node(30);
        tll.head = first;

        Node second = tll.new Node(20);
        first.next = second;

        Node third = tll.new Node(20);
        second.next = third;
        tll.print_linled_list();

    }
}
