package Collections_ADT;

public class Node {
    // Instance Members
    int data;
    Node next;

    //Constructors
    public Node(){
        this.data = Integer.MIN_VALUE;
        this.next = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

