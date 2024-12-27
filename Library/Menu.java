import java.util.Scanner;

public class Menu { // this class is used to display the menu of the library management system
    public static Scanner scanner = new Scanner(System.in);


    public static void displayMainMenu() {
        System.out.println("Enter your choice");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Display Items");
        System.out.println("4. Update Item");
        System.out.println("5. Exit");
    }

    public static void displayAddItemMenu() {
        System.out.println("1. Add a nonfiction Book");
        System.out.println("2. Add a Novel");
        System.out.println("3. Add a Magazine");
        System.out.println("4. Back to the Main Menu");
    }

    public static String getValidString(){
        boolean validInput = false;
        String input = "";
        while(!validInput){
            try{
                input = scanner.nextLine();
                validInput = true;
            }
            catch(Exception e){
                System.out.println("invalid input, try again");
            }
        }
        return input;
    }

    public static int getValidInt() {
        boolean validInput = false;
        int choice = 0;
        while (!validInput) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                validInput = true;

            } catch (Exception e) {
                System.out.println("invalid input, try again");
                scanner.nextLine();
            }
        }
        return choice;
    }

}
