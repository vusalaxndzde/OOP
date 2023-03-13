import bean.Book;
import bean.Company;

public class Main {
    public static void main(String[] args) {
        // Create 3 objects of encapsulated Book class
        Book greenMile = new Book(1, "Green Mile", "Stephen King", "Magic Realism", 10);
        Book stranger = new Book(2, "The Stranger", "Albert Camus", "Philosophical novel", 15);
        Book crimeAndPunishment = new Book(3, "Crime and Punishment", "Fyodor Dostoevsky", "Literary fiction", 20);

        System.out.println(crimeAndPunishment.sale());

        Company facebook = new Company("Facebook", "California", "aim", "Mark Zuckerberg", 500);
        facebook.info();
    }

}
