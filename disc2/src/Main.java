class Book {
    public static Book last = null;
    public String title;
    public Library library;

    public Book(String name) {
        title = name;
        last = this;
        library = null;
    }

    public static String lastBookTitle() {
        return last.title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    public static int totalBooks = 0;
    public Book[] books;
    public int index;

    public Library(int size) {
        books = new Book[size];
        index = 0;
    }

    public void addBook(Book book) {
        books[index] = book;
        index++;
        totalBooks++;
        book.library = this;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Library.totalBooks);
//        System.out.println(Book.lastBookTitle()); // NullPointerException
//        System.out.println(Book.getTitle()); // non-static method getTitle() cannot be referenced from a static context

        Book goneGirl = new Book("Gone Girl");
        Book fightClub = new Book("Fight Club");

        System.out.println(goneGirl.title);
        System.out.println(Book.lastBookTitle());
        System.out.println(fightClub.lastBookTitle());  // not a good coding style
        System.out.println(Book.last.title);

        Library libraryA = new Library(1);
        Library libraryB = new Library(2);
        libraryA.addBook(goneGirl);

        System.out.println(libraryA.index);
        System.out.println(Library.totalBooks);

        Library.totalBooks = 0;
        libraryB.addBook(fightClub);
        libraryB.addBook(goneGirl);

        System.out.println(libraryB.index);
        System.out.println(Library.totalBooks);
        System.out.println(goneGirl.library.books[0].title);
    }
}
