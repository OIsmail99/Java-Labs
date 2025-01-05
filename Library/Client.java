import java.util.*;

public class Client {
    int id;
    String name;
    String email;
    List<LibraryItem> borrowedItems = new ArrayList<LibraryItem>();

    public static Client getClientByID(int id) throws ClientNotFoundException {
        for (Client client : Library.clients) {
            if (client.getID() == id) {
                return client;
            }
        }
        throw new ClientNotFoundException("Client with ID " + id + " not found");
    }

    public Client(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<LibraryItem> getBorrowedItems() {
        List<LibraryItem> borrowedItems = new ArrayList<>();
        for (LibraryItem item : this.borrowedItems) {
            borrowedItems.add(item);
        }
        return borrowedItems;
    }

    public void getBorrowedItemsDetails() {
        for (LibraryItem item : this.borrowedItems) {
            System.out.println(item.getTitle());
        }
    }

    public void setBorrowedItems(LibraryItem item) {
        this.borrowedItems.add(item);
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printClientDetails() {
        System.out.println("ID of the client: " + getID() + "\nName of the client: " + getName()
                + "\nEmail of the client: " + getEmail());
        System.out.print("borrowed items: ");
        this.getBorrowedItemsDetails();
        System.out.println("***********************");
    }

    public boolean borrowItem(LibraryItem item) {
        if (item.isBorrowed()) {
            System.out.println("Item is already borrowed");
            return false;
        }
        borrowedItems.add(item);
        item.setBorrowed(true);
        return true;
    }

    public LibraryItem returnItem(LibraryItem inputItem) throws ItemNotFoundException {
        for (LibraryItem item : borrowedItems) {
            if (item.getID() == inputItem.getID()) {
                borrowedItems.remove(item);
                item.setBorrowed(false);
                return item;
            }
        }
        throw new ItemNotFoundException("item not found");
    }

}
