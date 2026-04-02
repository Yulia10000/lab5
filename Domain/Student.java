package Domain;

public class Student {
    private String id;
    private String name;
    private int booksIssued;
    private final int MAX_BOOKS = 3;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.booksIssued = 0;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getBooksIssued() { return booksIssued; }

    public boolean canTakeBook() {
        return booksIssued < MAX_BOOKS;
    }

    public void takeBook() {
        if (!canTakeBook()) {
            throw new RuntimeException("Ліміт книг перевищено");
        }
        booksIssued++;
    }
}
