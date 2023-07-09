/**
 * Array based list.
 *
 * @author Josh Hug
 */

public class AList {
    private static int MAXSIZE = 100;
    int size;
    int[] aListArray;


    /**
     * Creates an empty list.
     */
    public AList() {
        aListArray = new int[MAXSIZE];
        size = 0;

    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(int x) {
        if (isFull()) {
            resize(2 * size);
        }
        aListArray[size++] = x;
    }

    private boolean isFull() {
        return size == aListArray.length;
    }

    /**
     * Resize the current array into target capacity
     * @param newSize
     */
    private void resize(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(aListArray, 0, newArray, 0, size);
        aListArray = newArray;
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
        aListArray[(size--) - 1] = 0;
        return result;
    }
} 