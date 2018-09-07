package node.sll;

public class ListTester {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.add(8);
        sll.printValues();
        sll.remove();
        sll.remove();
        sll.printValues();
        for(int i=0;i<4;i++) {
            sll.removeAt(i);
            System.out.print("\nremoveAt: " + i );
            sll.printValues();
        }
    }
    
}
