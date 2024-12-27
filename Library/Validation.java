import java.util.regex.Pattern;

public class Validation { // this class is used to validate the input of the user

    public static boolean isValidID(int ID) {
        if (ID < 0) {
            return false;
        }
        return true;

    }

    public static boolean isExistingItemID(int ID) {
        for (LibraryItem item : Library.items) {
            if (item.getID() == ID) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUniqueItemID(int ID) {
        for (LibraryItem item : Library.items) {
            if (item.getID() == ID) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidTitle(String title) {
        if (title.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean isValidAuthor(String author) {
        if (author.length() == 0 || Pattern.matches(".*\\d.*", author)) {
            return false;
        }
        return true;
    }

    public static boolean isValidPrice(int price) {
        if (price < 0 || price > 100000) {
            return false;
        }
        return true;
    }

    public static boolean isValidGenre(String genre) {
        if (!Generes.genres.contains(genre.toLowerCase())) {
            return false;
        }
        return true;
    }

    public static boolean isValidEmail(String email) {
        if (!Pattern.matches("^(.+)@(.+)$", email)) {
            return false;
        }
        return true;
    }

    public static boolean isUniqueEmail(String email) {
        for (Client client : Library.clients) {
            if (client.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueClientID(int ID) {
        for (Client client : Library.clients) {
            if (client.getID() == ID) {
                return false;
            }
        }
        return true;
    }
}
