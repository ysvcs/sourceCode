import java.util.*;

class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data =  d;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while(n!=null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print("\n");
    }

    public void pushFront(int d) {
        Node newnode = new Node(d);
        newnode.next = head;
        head = newnode;
    }

    public void pushBack(int d) {
        Node fresh = new Node(d);
        fresh.next = null;
        Node last = head;
        while(last.next!=null) {
            last = last.next;
        }
        last.next = fresh;
    }

    public void deleteNode() {

    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        System.out.print("Enter data for new node:");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        llist.pushFront(d);
        llist.printList();
        System.out.println("Want to insert more elements: true/ false");
        Scanner ch = new Scanner(System.in);
        boolean c = ch.nextBoolean();
        System.out.println("Push at the front or at the end: front/ back ");
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        while (c) {
            System.out.print("Enter data:");
            d = sc.nextInt();
            switch (st) {
                case "front":
                    llist.pushFront(d);
                    break;
                case "back":
                    llist.pushBack(d);
                    break;
            }
            llist.printList();
            System.out.println("Want to insert more elements: true/ false");
            c = ch.nextBoolean();
            if (!c) 
                break;
            System.out.println("Push at the front or at the end: front/ back ");
            st = str.nextLine();   
        }
    }
}
