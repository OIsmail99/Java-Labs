import java.util.Scanner;

public class Main {
    static final int addItem = 1;
    static final int removeItem = 2;
    static final int displayItems = 3;
    static final int updateItem = 4;
    static final int addClient = 5;
    static final int displayClients = 6;
    static final int borrowItem = 7;
    static final int returnItem = 8;
    static final int exit = 9;

    static final int addNonFiction = 1;
    static final int addNovel = 2;
    static final int addMagazine = 3;
    static final int backToMainMenu = 4;
    static boolean mainMenuFlag = true;
    static boolean addMenuFlag = true;

    public static void main(String[] args) {

        // Client osama = new Client(1, "osama", "osama@gmail.com");
        // Client ahmad = new Client(2, "ahmad", "ahmad@gmail.com");
        // LibraryItem book = new Book(1, "my book", 500, "noam chomsky");
        // osama.borrowItem(book);
        // // osama.getClientDetails();
        // try {
        // osama.returnItem(book);
        // } catch (ItemNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // LibraryItem book2 = new Book(1, "my other book", 500, "noam chomsky");
        // ahmad.borrowItem(book);
        // ahmad.borrowItem(book2);
        // // osama.getClientDetails();
        // // ahmad.getClientDetails();
        // Library.displayItems();

        Scanner scanner = new Scanner(System.in);

        while (mainMenuFlag) {

            Menu.displayMainMenu();
            int mainMenuChoice = Menu.getValidInt();

            switch (mainMenuChoice) {

                case addItem: // adding an item

                    addMenuFlag = true;

                    while (addMenuFlag) {
                        Menu.displayAddItemMenu();
                        int addMenuChoice = Menu.getValidInt();
                        switch (addMenuChoice) {
                            case addNonFiction: // add a nonfiction
                                Operations.addNonFiction();
                                break;

                            case addNovel: // add a novel
                                Operations.addNovel();
                                break;

                            case addMagazine: // add a magazine
                                Operations.addMagazine();
                                break;

                            case backToMainMenu:// back to the main menu
                                addMenuFlag = false;
                                break;
                            default:
                                System.out.println("invalid choice, try again");
                                break;
                        }
                    }
                    break; // break from case 1
                case removeItem:
                    Operations.removeItem();
                    break;
                case displayItems:
                    Library.displayItems();
                    break;
                case updateItem:
                    Operations.updateItem();
                    break;
                case addClient: // email uniqueness function is not working yet.
                    Operations.addClient();
                    break;
                case displayClients:
                    Library.displayCleints();
                    break;
                case borrowItem:
                    Operations.borrowItem();
                    break;
                case returnItem:
                    Operations.returnItem();
                    break;
                case exit:
                    mainMenuFlag = false;
                    break;
                default:
                    System.out.println("invalid choice, try again.");
                    break;
            }
        }
    }
}
