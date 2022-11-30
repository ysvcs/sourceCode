import java.util.*;

class ReverseString {
    static Node top;
    static class Node {
        char data;
        Node next;
        Node(char d) {
            data = d;
            next = null;
        }
    }
    static void push(char a) {
        Node temp = new Node(a);
        temp.next=top;
        top=temp;
    }
    pop() {
        char popped;

    }
    public static void main(String[] args) {
        String str = "HareKrishna";
        char[] ch = new char[100];
        ch = str.toCharArray();
        int i, len;
        len=str.length();
        for(i=0;i<len;i++) {
            push(ch[i]);
        }
        

    }
}