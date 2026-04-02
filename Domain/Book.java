package Domain;

public class Book {
    private String id;
    private String title;
    private int availableCopies;

    public Book(String id, String title, int availableCopies) {
        this.id = id;
        this.title = title;
        this.availableCopies = availableCopies;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getAvailableCopies() { return availableCopies; }

    public boolean canBeIssued() {
        return availableCopies > 0;
    }

    public void issue() {
        if (!canBeIssued()) {
            throw new RuntimeException("Книга недоступна");
        }
        availableCopies--;
    }
}
