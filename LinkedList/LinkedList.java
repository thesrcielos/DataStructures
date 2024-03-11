
public class LinkedList {
    private Node head;
    private Node tail;
    private int lenght;

    LinkedList() {
        lenght = 0;
    }

    LinkedList(int[] nums) {
        this();
        for (int num : nums) {
            add(num);
        }
    }

    public void add(int value) {
        if (lenght == 0) {
            Node node = new Node(value, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(value, null);
            tail.setNext(node);
            tail = node;
        }
        lenght++;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return head.toString();
    }
}

class Node {
    private int value;
    private Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return String.format("Node {value: %d, next: %s}", value, next != null ? next.toString() : "");
    }

}