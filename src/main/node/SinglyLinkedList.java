package node;

public class SinglyLinkedList {

    public Node head;

    public SinglyLinkedList() { head = null; }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }
        else {
            Node r = head;
            while(r.next != null) {
                r = r.next;
            }
            r.next = newNode;
        }
    }

    public void remove() {
        Node r = head;
        while(r!=null&&r.next!=null&&r.next.next!=null) r = r.next;
        if(r==null||r.next==null) head=null;
        else r.next=null;
    }

    public Node find(int val) {
        Node r = head;
        while(r!=null){
            if(r.value==val) return r;
            r=r.next;
        }
        return null;
    }

    public boolean removeAt(int n) {
        if(n<0||head==null) return false;
        if(n==0) {
            head=head.next;
            return true;
        }
        Node r = head;
        for(int i=0;i<n-1;i++) {
            if(r.next==null||r.next.next==null) {
                return false;
            }
            r=r.next;
        }
        if(r.next==null) return false;
        r.next=r.next.next;
        return true;
    }

    public void printValues() {
        if(head==null) {
            System.out.print("\nnull");
            return;
        }
        Node r = head;
        System.out.print("\n");
        while(r!=null) {
            System.out.print(r.value + " ");
            r = r.next;
        }
    }

}
