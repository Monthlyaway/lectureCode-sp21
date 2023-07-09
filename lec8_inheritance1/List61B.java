//package lec8_inheritance1;

/**
 * interface is what a list can do, not how to do it
 * similar to pure virtual function
 * should not include private function, as they are secret implementations
 *
 * @param <Item>
 */
public interface List61B<Item> {
    public void insert(Item x, int position);

    public void addFirst(Item x);

    public void addLast(Item x);

    public Item getFirst();

    public Item getLast();

    public Item removeLast();

    default public void print() {
        System.out.print("{ ");
        for (int i = 0; i < size(); i += 1) {
            System.out.print(get(i) + " ");
        }
        System.out.print(" }");
    }

    public Item get(int i);

    public int size();
}
