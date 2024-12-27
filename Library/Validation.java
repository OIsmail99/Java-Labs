import java.util.regex.Pattern;

public class Validation { // this class is used to validate the input of the user

    public static boolean isValidID(int ID) {
        if (ID < 0) {
            return false;
        }
        return true;

    }

    public static boolean isExistingID(int ID) {
        for (LibraryItem item : Library.items) {
            if (item.getID() == ID) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUniqueID(int ID) {
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

    public static void isValidEmail(String email) {
        if (!Pattern.matches("^(.+)@(.+)$", email)) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}
