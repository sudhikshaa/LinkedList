package Linkedlist.com;

public class NodeList {
    private Node head;
    private Node tail;

    private int size;

    public NodeList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        if(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }

        public Node(int val , Node next){
            this.value = val;
            this.next = next;
        }
    }
}
