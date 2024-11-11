public class Books {
    private String bookCode;
    private String name;
    private String author;
    private double price;

    public Books(String bookCode, String name, String author, double price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Books() {
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }



    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}