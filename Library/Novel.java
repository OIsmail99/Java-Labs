public class Novel extends Book {
    private String genre;

    public Novel(int ID, String title, int price, String author, String genre) {
        super(ID, title, price, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (Validation.isValidGenre(genre)) {
            this.genre = genre;
        }
    }

    @Override
    public void getItemsDetails() {
        System.out.println("ID: " + getID());
        System.out.println("Title: " + getTitle());
        System.out.println("Price: " + getPrice());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
    }
}
