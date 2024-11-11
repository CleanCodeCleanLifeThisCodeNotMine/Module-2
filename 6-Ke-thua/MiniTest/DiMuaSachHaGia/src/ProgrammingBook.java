public class ProgrammingBook extends Books {
    private String language;
    private String framework;

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }
    public ProgrammingBook(String bookCode, String name, String author, double price, String language, String framework) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }



    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.95;
    }
}