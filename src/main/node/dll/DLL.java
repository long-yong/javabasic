package node.dll;

public class DLL {

    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    public void printValuesForward() {
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

}
