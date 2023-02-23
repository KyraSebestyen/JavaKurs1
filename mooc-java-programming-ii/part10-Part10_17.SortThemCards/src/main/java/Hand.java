import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {
    private List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.forEach(System.out::println);
    }

    public void sort() {
        this.cards = this.cards.stream().sorted().collect(Collectors.toList());
    }

    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand o) {
        int thisValue = 0;
        for (Card card : this.cards) {
            thisValue += card.getValue();
        }
        int thatValue = 0;
        for (Card card : o.cards) {
            thatValue += card.getValue();
        }
        return thisValue - thatValue;
    }
}
