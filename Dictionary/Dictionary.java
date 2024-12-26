import java.util.*;

import javafx.scene.control.TreeCell;

class Dictionary {

    static TreeMap<Character, TreeSet<String>> dictionary = new TreeMap<>();

    public static void addWord(String word) {
        Character firstLetter = Character.toUpperCase(word.charAt(0));
        TreeSet<String> words = dictionary.get(firstLetter);
        words.add(word);
    }

    public static void print() {
        System.out.println(dictionary);
    }

    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] letterArray = letters.toCharArray();
        for (int i = 0; i < letters.length(); i++) {
            dictionary.put(letterArray[i], new TreeSet<String>());
        }
        addWord("Apple");
        addWord("letters");
        addWord("FullFree");
        print();
    }
}