package sudhi.com;

import sudhi.com.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(5);
        ll.insertAtFirst(8);
        ll.insertAtFirst(3);
        ll.insertAtFirst(9);
        ll.insertAtFirst(14);
        ll.insertAtLast(19);
        ll.insertAtMiddle(25,3);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.deleteAtMiddle(2));
        ll.display();

    }
}