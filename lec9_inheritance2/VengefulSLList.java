package lec9_inheritance2;

/**
 * SList with additional operation printLostItems() which prints all items
 * that have ever been deleted.
 */
public class VengefulSLList<Item> extends SLList<Item> {
    private SLList<Item> deletedItems;

    public VengefulSLList() {
        super();
        deletedItems = new SLList<>();
    }

    public VengefulSLList(Item x) {
        super(x);
        deletedItems = new SLList<>();
    }

    public void printLostItems() {
        deletedItems.print();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    public static void main(String[] args) {

        VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>(0);
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(10);
        vs1.addLast(13);
        // vs1 is now: [1, 5, 10, 13]


        vs1.removeLast();
        vs1.removeLast();
        // After deletion, vs1 is: [1, 5]

        // Should print out the numbers of the fallen, namely 10 and 13.
        System.out.print("The fallen are: ");
        vs1.printLostItems();
    }
} 