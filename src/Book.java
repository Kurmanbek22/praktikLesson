import java.time.LocalDate;

public class Book extends Product {
    private String authorName;
    public Book(){

    }
    public Book(String authorName) {
        this.authorName = authorName;
    }

    public Book( String authorName, String name, String description, int price, LocalDate createdAt) {
        super(name, description, price, createdAt);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
