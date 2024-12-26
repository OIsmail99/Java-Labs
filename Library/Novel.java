public class Novel extends Book {
    private String genre;
    public Novel(int ID, String title,int price, String author, String genre){
        super(ID, title, price, author);
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        if(Validation.isValidGenre(genre)){
            this.genre = genre;
        }
    }
}
