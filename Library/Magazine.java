public class Magazine extends LibraryItem {

    String editor;

    public Magazine(int ID, String title, int price, String editor) {
        super(ID, title, price);
        this.editor = editor;
    }

    public void getItemsDetails() {
        System.out.println(
                "ID: " + getID() + "\nTitle: " + getTitle() + "\nAuthor: " + getEditor() + "\nPrice: " + getPrice());
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

}
