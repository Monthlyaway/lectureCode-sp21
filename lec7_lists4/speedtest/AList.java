package lec7_lists4.speedtest;

/**
 * Array based list.
 *
 * @author Josh Hug
 */

public class AList<elemType> {
    private static int ORIGINSIZE = 100;
    int size;
    elemType[] aListArray;


    /**
     * Creates an empty list.
     */
    public AList() {
        aListArray = (elemType[]) new Object[ORIGINSIZE];
        size = 0;

    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(elemType x) {
        if (isFull()) {
            resize(100 * size);
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
        elemType[] newArray = (elemType[]) new Object[newSize];
        System.arraycopy(aListArray, 0, newArray, 0, size);
        aListArray = newArray;
    }

    /**
     * Returns the item from the back of the list.
     */
    public elemType getLast() {
        return aListArray[size - 1];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public elemType get(int i) {
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
    public elemType removeLast() {
        elemType result = aListArray[size - 1];
        aListArray[(size--) - 1] = null;
        return result;
    }
} 