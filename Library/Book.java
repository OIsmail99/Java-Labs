public class Book extends LibraryItem {

    private String author;

    public Book(int ID, String title, int price, String author) {
        super(ID, title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (Validation.isValidAuthor(author)) {
            this.author = author;
            return;
        }
        throw new IllegalArgumentException("Invalid author");
    }

    public void getItemsDetails() {
        System.out.println("ID of the book: " + getID() + "\nTitle of the book: " + getTitle() + "\nAuthor of the book: " + getAuthor() + "\nPrice of the book: "
                + getPrice());
    }
}
