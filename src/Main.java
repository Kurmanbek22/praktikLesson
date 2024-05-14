import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Electronics electronics= new Electronics("Mac","silver",512,"m1","notebook",120000,LocalDate.of(2020,9,23));
        Electronics electronics1= new Electronics("Mac","silver",512,"m2","notebook",150000,LocalDate.of(2022,9,23));
        Electronics electronics2= new Electronics("Mac","silver",512,"m3","notebook",180000,LocalDate.of(2023,9,23));
        Book book =new Book("Ch. Aitmatov" , "Jamila","dramma",2000, LocalDate.of(1958,1,20));
        Book book1 =new Book("Ch. Aitmatov" , "Delbirim","dramma",2100, LocalDate.of(1958,1,20));

    }
}