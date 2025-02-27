package lec10_inheritance3;

public class Dog implements Comparable<Dog> {
    public String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    /**
     * return negative number if rhs is smaller than this
     * @param uddaDog the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Dog uddaDog) {
        //assume nobody is messing up and giving us
        //something that isn't a dog.
        return size - uddaDog.size;
    }



    public void bark() {
        System.out.println(name + " says: bark");
    }
}