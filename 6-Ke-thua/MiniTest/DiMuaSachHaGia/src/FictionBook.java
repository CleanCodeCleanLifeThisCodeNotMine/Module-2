public class FictionBook extends Books {
    private String category;


    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, String author, double price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.97;
    }
}