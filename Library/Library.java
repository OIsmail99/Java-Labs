import java.util.*;

public class Library {
    static List<LibraryItem> items = new ArrayList<LibraryItem>();
    static List<Client> clients = new ArrayList<Client>();

    public static void addItem(LibraryItem item) {
        items.add(item);
    }

    public static void removeItem(int ID) throws ItemNotFoundException {
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.getID() == ID) {
                items.remove(item);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("Item with ID " + ID + " not found");
        }
    }

    public static void displayItems() {
        if (items.size() == 0) {
            System.out.println("Library is empty");
            return;
        }
        System.out.println("Items in the library are:");
        for (LibraryItem item : items) {
            item.getItemsDetails();
            System.out.println("****************");
        }
    }

    // fix this method
    public static LibraryItem searchItem(int ID) throws ItemNotFoundException {
        for (LibraryItem item : items) {
            if (item.getID() == ID) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item with ID " + ID + " not found");
    }

    public static void addClient(Client client) {
        clients.add(client);
    }

    public static void removeClient(int ID) throws ClientNotFoundException {
        boolean found = false;
        for (Client client : clients) {
            if (client.getID() == ID) {
                clients.remove(client);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ClientNotFoundException("Client with ID " + ID + " not found");
        }
    }

}
