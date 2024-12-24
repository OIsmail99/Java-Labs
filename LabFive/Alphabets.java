package LabFive;
public class Alphabets{
 public static boolean containsOnlyAlphabets(String text) {
            char[] arr = text.toCharArray();
            for (char character : arr) {
                if (!Character.isLetter(character) && !Character.isSpaceChar(character))
                    return false; // if character is neither a letter nor space.
            }
            return true;
        }
}