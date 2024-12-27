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
        // Scanner scanner = new Scanner(System.in);

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
