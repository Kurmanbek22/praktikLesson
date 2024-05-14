import java.time.LocalDate;

public class Product {
    private String name;
    private  String description;
    private int price;
    LocalDate createdAt;

    public Product() {
    }
    public Product(String name,String description, int price, LocalDate createdAt){
        this.name=name;
        this.description=description;
        this.price=price;
        this.createdAt=createdAt;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
