public class Book {
    private String name; //name of the book
    private Author author; // we insert the author class here
    private double price;
    private int quantity;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public String toString() {
        return ("The book "+this.name+" is written by "+this.author.getName()+" and email is "+this.author.getEmail());
    }
}
