package bean;

public class Book {

    /*
    -  id
    -  name
    -  authorName
    -  genre
    -  price
    + sale(){};
    Return genre, name and price after 20% discount
     */

    private int id;
    private String name;
    private String authorName;
    private String genre;
    private double price;

    public Book() {
    }

    public Book(int id, String name, String authorName, String genre, double price) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.genre = genre;
        this.price = price;
    }

    public String sale() {
        double price = this.price * 0.8;
        return this.genre + "   " + this.name + "   " + price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
