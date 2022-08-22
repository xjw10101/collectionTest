package main.java.com.xjw.arrayList;


public class LinkedList {
    public static void main(String[] args) {

        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        A.next = B;
        B.next = C;
        C.pre = B;
        B.pre = A;
        Node first = A;
        Node last = C;
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("1");
        linkedList.remove();
    }
}


class Node{
    public Node next;
    public Node pre;
    private String item;

    public Node(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item='" + item + '\'' +
                '}';
    }
}