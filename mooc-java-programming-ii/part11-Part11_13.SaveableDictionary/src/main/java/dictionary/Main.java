package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        dictionary.add("määrä", "number");
        dictionary.add("testata", "test");
        dictionary.add("hauskaa", "fun");

        dictionary.save();
    }
}
