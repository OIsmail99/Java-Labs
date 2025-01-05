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
            if (Validation.isExistingItemID(intInput) == true || Validation.isValidID(intInput) == false) {
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
            if (Validation.isExistingItemID(intInput) == true || Validation.isValidID(intInput) == false) {
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
            if (Validation.isExistingItemID(intInput) == true || Validation.isValidID(intInput) == false) {
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
        if (Library.items.size() == 0) {
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

    public static void updateItem() {
        boolean updatedItem = false;
        while (updatedItem == false) {

            System.out.println("Enter the ID of the item you want to update");
            int inputID = Menu.getValidInt();
            // validate all the attributes before setting them
            try {
                LibraryItem item = Library.searchItem(inputID);
                boolean isValidTitle = false;
                while (isValidTitle == false) {
                    System.out.println("Enter the new title of the item");
                    String newTitle = Menu.getValidString();
                    if (Validation.isValidTitle(newTitle)) {
                        item.setTitle(newTitle);
                        isValidTitle = true;
                    } else {
                        System.out.println("Invalid title");
                    }
                }

                boolean isValidPrice = false;
                while (isValidPrice == false) {
                    System.out.println("Enter the new price of the item");
                    int newPrice = Menu.getValidInt();
                    if (Validation.isValidPrice(newPrice)) {
                        item.setPrice(newPrice);
                        isValidPrice = true;
                    } else {
                        System.out.println("Invalid price");
                    }
                }

                if (item instanceof Book) {
                    boolean isValidAuthor = false;
                    while (isValidAuthor == false) {
                        System.out.println("Enter the new author of the book");
                        String newAuthor = Menu.getValidString();
                        if (Validation.isValidAuthor(newAuthor)) {
                            ((Book) item).setAuthor(newAuthor);
                            isValidAuthor = true;
                        } else {
                            System.out.println("Invalid author");
                        }
                    }
                }

                else if (item instanceof Novel) {
                    boolean isValidGenre = false;
                    while (isValidGenre == false) {
                        System.out.println("Enter the new genre of the novel");
                        String newGenre = Menu.getValidString();
                        if (Validation.isValidGenre(newGenre)) {
                            ((Novel) item).setGenre(newGenre);
                            isValidGenre = true;
                        } else {
                            System.out.println("Invalid genre");
                        }
                    }

                } else if (item instanceof Magazine) {
                    boolean isValidEditor = false;
                    while (isValidEditor == false) {
                        System.out.println("Enter the new editor of the magazine");
                        String newEditor = Menu.getValidString();
                        if (Validation.isValidAuthor(newEditor)) {
                            ((Magazine) item).setEditor(newEditor);
                            isValidEditor = true;
                        } else {
                            System.out.println("Invalid editor");
                        }
                    }
                }
                updatedItem = true;
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void addClient() {
        int ID = 0;
        String name = "";
        String email = "";
        boolean validInput = false;
        System.out.println("Enter the ID of the client");
        while (validInput == false) {
            int inputID = Menu.getValidInt();
            if (Validation.isValidID(inputID) == false || Validation.isUniqueClientID(inputID) == false) {
                System.out.println("invalid input, try again");
            } else {
                ID = inputID;
                validInput = true;
            }
        }
        System.out.println("Enter the name of the client");
        validInput = false;
        while (validInput == false) {
            String inputName = Menu.getValidString();
            if (Validation.isValidAuthor(inputName) == false) {
                System.out.println("invalid input, try again");
            } else {
                name = inputName;
                validInput = true;
            }
        }

        System.out.println("Enter Email of the client");
        validInput = false;
        while (validInput == false) {
            String inputEmail = Menu.getValidString();
            if (Validation.isValidEmail(inputEmail) == false || Validation.isUniqueEmail(inputEmail) == false) {
                System.out.println("invalid input, try again");
            } else {
                email = inputEmail;
                validInput = true;
            }
        }
        Client newClient = new Client(ID, name, email);
        Library.clients.add(newClient);
    }

    public static void borrowItem() {
        Client client = null;
        LibraryItem item = null;
        boolean validID = false;
        while (!validID) {
            System.out.println("Enter the Client ID: ");
            int inputID = Menu.getValidInt();
            try {
                client = Library.searchClient(inputID);
                validID = true;

            } catch (ClientNotFoundException e) {
                System.out.println("Client not found, try again");
            }
        }

        validID = false;
        while (!validID) {
            System.out.println("Enter the ID of the item you want to borrow: ");
            int inputID = Menu.getValidInt();
            try {
                item = Library.searchItem(inputID);
                if (item.isBorrowed() == false) {
                    validID = true;
                } else {
                    System.out.println("Item is already borrowed!");
                }

            } catch (ItemNotFoundException e) {
                System.out.println("Item not found, try again");
            }
        }
        client.borrowedItems.add(item);
    }

    public static void returnItem() {
        Client client = null;
        LibraryItem item = null;
        boolean validID = false;
        while (!validID) {
            System.out.println("Enter the Client ID: ");
            int inputID = Menu.getValidInt();
            try {
                client = Library.searchClient(inputID);
                validID = true;

            } catch (ClientNotFoundException e) {
                System.out.println("Client not found, try again");
            }
        }

        validID = false;
        while (!validID) {
            System.out.println("Enter the ID of the item you want to return: ");
            int inputID = Menu.getValidInt();
            try {
                item = Library.searchItem(inputID);
                if (client.borrowedItems.contains(item)) {
                    validID = true;
                } else {
                    System.out.println("Item is not borrowed!");
                }

            } catch (ItemNotFoundException e) {
                System.out.println("Item not found, try again");
            }
        }
        client.borrowedItems.remove(item);

    }
}
