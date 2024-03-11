public class TestLinkedList {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };
        LinkedList linkedList = new LinkedList(values);
        System.out.println(linkedList.find(5));
    }
}
