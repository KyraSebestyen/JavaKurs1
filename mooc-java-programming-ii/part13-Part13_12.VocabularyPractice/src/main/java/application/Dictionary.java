package application;

import java.util.*;

public class Dictionary {
    private Map<String, String> translations = new HashMap<>();
    private List<String> words = new ArrayList<>();

    public Dictionary() {
        addTranslation("Wort", "sana");
    }

    public void addTranslation(String word, String translation) {
        if (!words.contains(word)) {
            words.add(word);
        }
        translations.put(word, translation);
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }

    public void printAllTranslations() {
        translations.entrySet().stream()
                .map(entrySet -> entrySet.getKey() + " -> " + entrySet.getValue())
                .forEach(System.out::println);
    }
}
