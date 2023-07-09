package lec7_lists4;

/**
 * Array based list.
 *
 * @author Josh Hug
 */

public class AList {
    private int[] aListArray;
    private int size;

    /**
     * Creates an empty list.
     */
    public AList() {
        aListArray = new int[100];
        size = 0;
    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(int x) {
        aListArray[size++] = x;
    }

    /**
     * Returns the item from the back of the list.
     */
    public int getLast() {
        return aListArray[size - 1];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public int get(int i) {
        return aListArray[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public int removeLast() {
        int result = aListArray[size - 1];
        aListArray[size - 1] = 0;
        size--;
        return result;
    }
}