public class Operations {
    public static void addNonFiction() { // ID, title, price, author
        String title = "";
        int ID = 0;
        String author = "";
        int price = 0;

        System.out.println("Enter ID of the book: ");

        boolean validInput = false;

        while (validInput == false) {
            int intInput = Menu.getValidInt();
            if (Validation.isExistingID(intInput) == true || Validation.isValidID(intInput) == false) {
                System.out.println("invalid input");
            } else {
                ID = intInput;
                validInput = true;
            }
        }

        System.out.println("Enter title of the book: ");

        validInput = false;
        while (validInput == false) {
            String stringInput = Menu.getValidString();
            if (!Validation.isValidTitle(stringInput)) {
                System.out.println("invalid input");
            } else {
                title = stringInput;
                validInput = true;
            }
        }

        System.out.println("Enter price of the book: ");

        validInput = false;
        while (validInput == false) {
            int intInput = Menu.getValidInt();
            if (!Validation.isValidPrice(intInput)) {
                System.out.println("invalid input");
            } else {
                price = intInput;
                validInput = true;
            }
        }

        System.out.println("Enter author of the book: ");

        validInput = false;
        while (validInput == false) {
            String stringInput = Menu.getValidString();
            if (!Validation.isValidAuthor(stringInput)) {
                System.out.println("invalid input");
            } else {
                author = stringInput;
                validInput = true;
            }
        }
        Book newBook = new Book(ID, title, price, author);
        Library.items.add(newBook);
    }

    public static void addNovel() {
        String title = "";
        int ID = 0;
        String author = "";
        int price = 0;
        String genre = "";

        System.out.println("Enter ID of the novel: ");

        boolean validInput = false;

        while (validInput == false) {
            int intInput = Menu.getValidInt();
            if (Validation.isExistingID(intInput) == true || Validation.isValidID(intInput) == false) {
                System.out.println("invalid input");
            } else {
                ID = intInput;
                validInput = true;
            }
        }

        System.out.println("Enter title of the novel: ");

        validInput = false;
        while (validInput == false) {
            String stringInput = Menu.getValidString();
            if (!Validation.isValidTitle(stringInput)) {
                System.out.println("invalid input");
            } else {
                title = stringInput;
                validInput = true;
            }
        }

        System.out.println("Enter price of the novel: ");

        validInput = false;
        while (validInput == false) {
            int intInput = Menu.getValidInt();
            if (!Validation.isValidPrice(intInput)) {
                System.out.println("invalid input");
            } else {
                price = intInput;
                validInput = true;
            }
        }

        System.out.println("Enter author of the novel: ");

        validInput = false;
        while (validInput == false) {
            String stringInput = Menu.getValidString();
            if (!Validation.isValidAuthor(stringInput)) {
                System.out.println("invalid input");
            } else {
                author = stringInput;
                validInput = true;
            }
        }

        System.out.println("Enter genre of the novel: ");

        validInput = false;
        while (validInput == false) {
            String genreInput = Menu.getValidString();
            if (!Validation.isValidGenre(genreInput)) {
                System.out.println("invalid input");
            } else {
                genre = genreInput;
                validInput = true;
            }
        }

        Novel newNovel = new Novel(ID, title, price, author, genre);
        Library.items.add(newNovel);
    }

    public static void addMagazine() {
        String title = "";
        int ID = 0;
        String editor = "";
        int price = 0;

        System.out.println("Enter ID of the magazine: ");

        boolean validInput = false;

        while (validInput == false) {
            int intInput = Menu.getValidInt();
            if (Validation.isExistingID(intInput) == true || Validation.isValidID(intInput) == false) {
                System.out.println("invalid input");
            } else {
                ID = intInput;
                validInput = true;
            }
        }

        System.out.println("Enter title of the magazine: ");

        validInput = false;
        while (validInput == false) {
            String stringInput = Menu.getValidString();
            if (!Validation.isValidTitle(stringInput)) {
                System.out.println("invalid input");
            } else {
                title = stringInput;
                validInput = true;
            }
        }

        System.out.println("Enter price of the magazine: ");

        validInput = false;
        while (validInput == false) {
            int intInput = Menu.getValidInt();
            if (!Validation.isValidPrice(intInput)) {
                System.out.println("invalid input");
            } else {
                price = intInput;
                validInput = true;
            }
        }

        System.out.println("Enter editor of the magazine: ");

        validInput = false;
        while (validInput == false) {
            String stringInput = Menu.getValidString();
            if (!Validation.isValidAuthor(stringInput)) {
                System.out.println("invalid input");
            } else {
                editor = stringInput;
                validInput = true;
            }
        }
        Magazine newMagazine = new Magazine(ID, title, price, editor);
        Library.items.add(newMagazine);
    }

    public static void removeItem() {
        if(Library.items.size() == 0){
            System.out.println("Library is empty");
            return;
        }
        boolean validID = false;

        System.out.println("Enter the ID of the item you want to remove");
        while (validID == false) {
            int itemID = Menu.getValidInt();
            try {
                Library.removeItem(itemID);
                validID = true;
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
