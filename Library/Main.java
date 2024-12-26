import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean mainMenuFlag = true;
        int mainMenuChoice = 0;

        while (mainMenuFlag) {
            Menu.displayMenu();
            mainMenuChoice = scanner.nextInt();
            scanner.nextLine();
            switch (mainMenuChoice) {
                case 1:
                    // clear the terminal
                    System.out.print("\033[H\033[2J");

                    Menu.displayAdd();
                    int addMenuChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (addMenuChoice) {
                        case 1: // add a book

                            break; // return to main menu
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            mainMenuFlag = false;
                            break;
                        default:
                            break;

                    }

                case 2:
                case 3:
                case 4:
                default:
                    break;
            }
        }

        // scanner.close();
    }
}
