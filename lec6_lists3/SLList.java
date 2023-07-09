//package lec6_lists3;

/**
 * An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within.
 */
public class SLList<elemType> {
    private StuffNode first;
    private int size;

    public SLList(elemType x) {
        first = new StuffNode(x, null);
        size = 1;
    }

    /**
     * Adds x to the front of the list.
     */
    public void addFirst(elemType x) {
        first = new StuffNode(x, first);
        size += 1;
    }

    /**
     * Returns the first item in the list.
     */
    public elemType getFirst() {
        return first.item;
    }

    /**
     * Adds an item to the end of the list.
     */
    public void addLast(elemType x) {
        size += 1;

        StuffNode p = first;

        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new StuffNode(x, null);
    }

    public int size() {
        return size;
    }

    private class StuffNode {
        public elemType item;
        public StuffNode next;

        public StuffNode(elemType i, StuffNode n) {
            item = i;
            next = n;
        }
    }
}