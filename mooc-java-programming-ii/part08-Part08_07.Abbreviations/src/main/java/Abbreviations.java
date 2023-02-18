import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private Map<String, String> abbreviationExplanation = new HashMap<>();

    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.abbreviationExplanation.containsKey(abbreviation)) {
            return;
        }
        this.abbreviationExplanation.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationExplanation.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviationExplanation.get(abbreviation);
    }
}
