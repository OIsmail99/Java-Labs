import java.util.*;

class Dictionary {

    static TreeMap<Character, TreeMap<String, String>> dictionary = new TreeMap<>();

    public static void addWord(String word, String definition) {
        char letter = word.charAt(0);
        TreeMap<String, String> wordAndDefinition = dictionary.get(letter);
        wordAndDefinition.put(word, definition);
    }

    public static void print() {
        System.out.println(dictionary);
    }

    public static void printWordsOfLetter(char letter) {
        System.out.println(dictionary.get(Character.toUpperCase(letter)));
    }

    public static void main(String[] args) {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] letterArray = letters.toCharArray();
        for (int i = 0; i < letterArray.length; i++) {
            dictionary.put(letterArray[i], new TreeMap<String, String>());
        }

        addWord("Apple", "A fruit that prevents you from going to the doctor");
        addWord("Add", "A verb which I don't know its meaning");

        addWord("FullFree", "My favorite word in the dictionary");

        printWordsOfLetter('a');
        print();
    }
}