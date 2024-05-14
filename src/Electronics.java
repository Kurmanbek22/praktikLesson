import java.time.LocalDate;

public class Electronics extends Product{
    private String brand;
    private String color;
    private int memory;

    public Electronics() {
    }

    public  Electronics (String brand,String color, int memory){
        this.brand=brand;
        this.color=color;
        this.memory=memory;
    }

    public Electronics( String brand, String color, int memory, String name, String description, int price, LocalDate createdAt) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color=color;
        this.memory=memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
