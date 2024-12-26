import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean mainMenuFlag = true;
        int mainMenuChoice = 0;

        while (mainMenuFlag) {
            Menu.displayMainMenu();
            mainMenuChoice = scanner.nextInt();
            scanner.nextLine();
            switch (mainMenuChoice) {
                case 1: // add an item
                    Menu.displayAddMenu();
                    int addMenuChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (addMenuChoice) {
                        case 1: // add a book
                            // Enter ID, title, price, author of the book
                            System.out.println("Enter ID: ");
                            boolean validInputID = false;
                            int ID = 0;
                            while (!validInputID) {
                                try {
                                    ID = scanner.nextInt();
                                    scanner.nextLine();
                                    if (Validation.isValidID(ID) && Validation.isUniqueID(ID)) {
                                        validInputID = true;
                                    } else {
                                        System.out.println("Enter a valid and unique ID: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid and unique ID: ");
                                    scanner.nextLine();
                                }
                            }

                            System.out.println("Enter title: ");

                            boolean validInputTitle = false;
                            String title = "";
                            // do a try and catch inside while loop
                            while (!validInputTitle) {
                                try {
                                    title = scanner.nextLine();
                                    if (Validation.isValidTitle(title)) {
                                        validInputTitle = true;
                                    } else {
                                        System.out.println("Enter a valid title: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid title: ");
                                }
                            }

                            System.out.println("Enter price: ");
                            // do the same thing for price
                            boolean validInputPrice = false;
                            int price = 0;
                            while (!validInputPrice) {
                                try {
                                    price = scanner.nextInt();
                                    scanner.nextLine();
                                    if (Validation.isValidPrice(price)) {
                                        validInputPrice = true;
                                    } else {
                                        System.out.println("Enter a valid price: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid price: ");
                                    scanner.nextLine();
                                }
                            }

                            System.out.println("Enter author: ");
                            String author = "";
                            // do the same thing for author
                            boolean validInputAuthor = false;
                            while (!validInputAuthor) {
                                try {
                                    author = scanner.nextLine();
                                    if (Validation.isValidAuthor(author)) {
                                        validInputAuthor = true;
                                    } else {
                                        System.out.println("Enter a valid author: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid author: ");
                                }
                            }
                            Book book = new Book(ID, title, price, author);
                            Library.addItem(book);
                            System.out.println("Book added successfully");
                            break;

                        case 2: // add a magazine
                            // enter ID,title,price,editor of the magazine
                            System.out.println("Enter ID: ");
                            boolean validInputIDMag = false;
                            int IDMag = 0;
                            while (!validInputIDMag) {
                                try {
                                    IDMag = scanner.nextInt();
                                    scanner.nextLine();
                                    if (Validation.isValidID(IDMag) && Validation.isUniqueID(IDMag)) {
                                        validInputIDMag = true;
                                    } else {
                                        System.out.println("Enter a valid and unique ID: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid and unique ID: ");
                                    scanner.nextLine();
                                }
                            }

                            System.out.println("Enter title: ");
                            boolean validInputTitleMag = false;
                            String titleMag = "";
                            while (!validInputTitleMag) {
                                try {
                                    titleMag = scanner.nextLine();
                                    if (Validation.isValidTitle(titleMag)) {
                                        validInputTitleMag = true;
                                    } else {
                                        System.out.println("Enter a valid title: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid title: ");
                                }
                            }

                            System.out.println("Enter price: ");
                            boolean validInputPriceMag = false;
                            int priceMag = 0;
                            while (!validInputPriceMag) {
                                try {
                                    priceMag = scanner.nextInt();
                                    scanner.nextLine();
                                    if (Validation.isValidPrice(priceMag)) {
                                        validInputPriceMag = true;
                                    } else {
                                        System.out.println("Enter a valid price: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid price: ");
                                    scanner.nextLine();
                                }
                            }

                            System.out.println("Enter editor: ");
                            String editor = "";
                            boolean validInputEditor = false;
                            while (!validInputEditor) {
                                try {
                                    editor = scanner.nextLine();
                                    if (Validation.isValidAuthor(editor)) {
                                        validInputEditor = true;
                                    } else {
                                        System.out.println("Enter a valid editor: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid editor: ");
                                }
                            }
                            break;
                        case 3: // add a novel
                            // Enter ID, title, price, author and genre of the novel
                            System.out.println("Enter ID: ");
                            boolean validInputIDNov = false;
                            int IDNov = 0;
                            while (!validInputIDNov) {
                                try {
                                    IDNov = scanner.nextInt();
                                    scanner.nextLine();
                                    if (Validation.isValidID(IDNov) && Validation.isUniqueID(IDNov)) {
                                        validInputIDNov = true;
                                    } else {
                                        System.out.println("Enter a valid and unique ID: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid and unique ID: ");
                                    scanner.nextLine();
                                }
                            }

                            System.out.println("Enter title: ");
                            boolean validInputTitleNov = false;
                            String titleNov = "";
                            while (!validInputTitleNov) {
                                try {
                                    titleNov = scanner.nextLine();
                                    if (Validation.isValidTitle(titleNov)) {
                                        validInputTitleNov = true;
                                    } else {
                                        System.out.println("Enter a valid title: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid title: ");
                                }
                            }

                            System.out.println("Enter price: ");
                            boolean validInputPriceNov = false;
                            int priceNov = 0;
                            while (!validInputPriceNov) {
                                try {
                                    priceNov = scanner.nextInt();
                                    scanner.nextLine();
                                    if (Validation.isValidPrice(priceNov)) {
                                        validInputPriceNov = true;
                                    } else {
                                        System.out.println("Enter a valid price: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid price: ");
                                    scanner.nextLine();
                                }
                            }

                            System.out.println("Enter author: ");
                            String authorNov = "";
                            boolean validInputAuthorNov = false;
                            while (!validInputAuthorNov) {
                                try {
                                    authorNov = scanner.nextLine();
                                    if (Validation.isValidAuthor(authorNov)) {
                                        validInputAuthorNov = true;
                                    } else {
                                        System.out.println("Enter a valid author: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid author: ");
                                }
                            }

                            System.out.println("Enter genre: ");
                            String genre = "";
                            boolean validInputGenre = false;
                            while (!validInputGenre) {
                                try {
                                    genre = scanner.nextLine();
                                    if (Validation.isValidGenre(genre)) {
                                        validInputGenre = true;
                                    } else {
                                        System.out.println("Enter a valid genre: ");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter a valid genre: ");
                                }
                            }
                            Novel novel = new Novel(IDNov, titleNov, priceNov, authorNov, genre);
                            Library.addItem(novel);
                            System.out.println("Novel added successfully");
                            break;

                        case 4: // back to main menu
                            mainMenuFlag = false;
                            break;
                        default:
                            break;

                    }
                    break; // breaking from case 1 in the outer menu.

                case 2: // to remove an Item
                    if (Library.items.size() == 0) {
                        System.out.println("Library is empty");
                        break;
                    }
                    System.out.println("Enter the ID of the item you want to remove: ");
                    boolean isValidInput = false;
                    int ID = 0;
                    while (isValidInput == false) {
                        try {
                            ID = scanner.nextInt();
                            scanner.nextLine();

                            if (!Validation.isExistingID(ID) || !Validation.isValidID(ID)) {
                                System.out.println("Invalid input, try again");
                            } else {
                                Library.removeItem(ID);
                                System.out.println("removed successfuly");
                                isValidInput = true;
                            }
                        } catch (Exception e) {
                            scanner.nextLine();
                            System.out.println("invalid input, try again");
                        }
                    }
                    System.out.println("press 1 to exit");
                    boolean validRemove = false;
                    int scan = 0;
                    while (validRemove) {
                        try {
                            scan = scanner.nextInt();
                            scanner.nextLine();
                            if (scan != 1) {
                                System.out.println("invalid, press 1");
                            } else {
                                validRemove = true;
                            }
                        } catch (Exception e) {
                            System.out.println("invalid, press 1 to exit");
                            scanner.nextLine();
                        }
                        System.out.println("press 1 to exit:");
                    }
                    break;

                case 3:
                    if (Library.items.size() == 0) {
                        System.out.println("Library is empty");
                        break;
                    }
                    Library.displayItems();
                    System.out.println("press 1 to exit");
                    if (scanner.nextInt() == 1) {
                        scanner.nextLine();
                        break;
                    }
                    break;
                case 4: // prompt the user to update an item
                    if (Library.items.size() == 0) {
                        System.out.println("Library is empty");
                        break;
                    }
                    System.out.println("Enter the ID of the item you want to update: ");
                    boolean isValidInputUpdate = false;
                    int IDUpdate = 0;
                    while (isValidInputUpdate == false) {
                        try {
                            IDUpdate = scanner.nextInt();
                            scanner.nextLine();

                            if (!Validation.isExistingID(IDUpdate) || !Validation.isValidID(IDUpdate)) {
                                System.out.println("Invalid input, try again");
                            } else {
                                isValidInputUpdate = true;
                            }
                        } catch (Exception e) {
                            scanner.nextLine();
                            System.out.println("invalid input, try again");
                        }
                    }
                    break;
                case 5:
                    mainMenuFlag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
