package node.dll;

public class Node {

    public Integer value;
    public Node prev;
    public Node next;

    public Node(Integer val) {
        value = val;
        prev = null;
        next = null;
    }
}
