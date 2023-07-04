package lists2;

public class SLList {
    private IntNode sentinel;
    private int size;

    /**
     * Create an empty list, with a sentinel node at the front
     */
    public SLList() {
        sentinel = new IntNode(666, null);
        size = 0;
    }

    /**
     * Create a first node with item equals x
     *
     * @param x
     */
    public SLList(int x) {
        new SLList();
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public static void main(String[] args) {
        SLList L = new SLList();

        System.out.println("size: " + L.size());
    }

    /**
     * size is cached as a private member data, modified every time the list changes,
     * so just return size
     */
    public int size() {
        return size;
    }

    /**
     * Adds an item to the end of the list.
     */
    public void addLast(int x) {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size++;
    }

    /**
     * Adds an item to the front of the list.
     */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    /**
     * Retrieves the front item from the list.
     */
    public int getFirst() {
        return sentinel.next.item;
    }

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
}