import java.util.*;
public class Library {
    static List<LibraryItem> items = new ArrayList<LibraryItem>();
    public static void  addItem(LibraryItem item){
        items.add(item);
    }
    public static void removeItem(int ID) throws ItemNotFoundException{
        boolean found = false;
        for (LibraryItem item : items){
            if (item.getID() == ID){
                items.remove(item);
                found = true;
                break;
            }
        }
        if (!found){
            throw new ItemNotFoundException("Item with ID " + ID + " not found");
        }
    }
    public static void displayItems(){
        for (LibraryItem item : items){
            item.getItemsDetails();
        }
    }
    public static void searchItem(int ID) throws ItemNotFoundException{
        boolean found = false;
        for (LibraryItem item : items){
            if (item.getID() == ID){
                item.getItemsDetails();
                found = true;
                break;
            }
        }
        if (!found){
            throw new ItemNotFoundException("Item with ID " + ID + " not found");
        }
    }

}
