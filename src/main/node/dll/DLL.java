package node.dll;

public class DLL {

    public Node head;
    public Node tail;

    public DLL() {
        head = null;
        tail = null;
    }

    public void push(Node newNode) {
        if( head == null ) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node lastNode = tail;
        lastNode.next = newNode;
        newNode.prev = lastNode;
        tail = newNode;
    }

    public void printValuesForward() {
        Node r = head;
        while(r != null) {
            System.out.println(r.value);
            r = r.next;
        }
    }

}
