import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordAndTranslations = new HashMap<>();
    public void add(String word, String translation) {
        wordAndTranslations.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = wordAndTranslations.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return wordAndTranslations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        wordAndTranslations.remove(word);
    }
}
