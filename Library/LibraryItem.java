abstract public class LibraryItem {
        private int ID;
        private String title;
        private int price;
        protected boolean borrowed = false;

        public LibraryItem(int ID, String title, int price) {
                this.ID = ID;
                this.title = title;
                this.price = price;
                Library.addItem(this);
        }

        public boolean isBorrowed() {
                return borrowed;
        }

        public void setBorrowed(boolean borrowed) {
                this.borrowed = borrowed;
        }

        public int getID() {
                return ID;
        }

        public String getTitle() {
                return title;
        }

        public int getPrice() {
                return price;
        }

        public void setID(int ID) {
                this.ID = ID;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        abstract public void getItemsDetails();
}