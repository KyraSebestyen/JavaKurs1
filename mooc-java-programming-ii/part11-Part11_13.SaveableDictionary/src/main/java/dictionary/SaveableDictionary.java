package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SaveableDictionary {
    private final Map<String, String> wordsTranslations = new HashMap<>();
    private String file;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.file = file;
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];

                this.add(word, translation);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        final String dictionary = wordsTranslations.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining("\n"));
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(dictionary);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        wordsTranslations.putIfAbsent(word, translation);
    }

    public void delete(String word) {
        for (Map.Entry<String, String> inDictionary : wordsTranslations.entrySet()) {
            if (inDictionary.getKey().equals(word)) {
                wordsTranslations.remove(word);
                break;
            }
            if (inDictionary.getValue().equals(word)) {
                wordsTranslations.remove(inDictionary.getKey());
                break;
            }
        }
    }

    public String translate(String word) { // should work both ways
        String translation = null;
        for (Map.Entry<String, String> inDictionary : wordsTranslations.entrySet()) {
            if (inDictionary.getKey().equals(word)) {
                translation = inDictionary.getValue();
            }
            if (inDictionary.getValue().equals(word)) {
                translation = inDictionary.getKey();
            }
        }
        return translation;
    }
}
