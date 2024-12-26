public class Validation { //this class is used to validate the input of the user
    public static boolean isValidID(int ID){
        if (ID < 0){
            return false;
        }
        return true;


    }
    public static boolean isUniqueID(int ID){
        for (LibraryItem item : Library.items){
            if (item.getID() == ID){
                return false;
            }
        }
        return true;
    }
    public static boolean isValidTitle(String title){
        if (title.length() == 0){
            return false;
        }
        return true;
    }
    public static boolean isValidAuthor(String author){
        if (author.length() == 0){
            return false;
        }
        return true;
    }
    public static boolean isValidPrice(int price){
        if (price < 0 || price > 5000){
            return false;
        }
        return true;
    }
    public static boolean isValidPages(int pages){
        if (pages < 0){
            return false;
        }
        return true;
    }
    public static boolean isValidGenre(String genre){
        if (genre != Generes.valueOf(genre).toString()){
            return false;
        }
        return true;
    }

}
