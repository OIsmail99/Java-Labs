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

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getClientDetails() {
        System.out.println("ID: " + getID() + "\nName: " + getName() + "\nEmail: " + getEmail());
    }

    public void borrowItem(LibraryItem item) {
        if(item.isBorrowed){
            System.out.println("Item is already borrowed");
            return;
        }
    }
}
