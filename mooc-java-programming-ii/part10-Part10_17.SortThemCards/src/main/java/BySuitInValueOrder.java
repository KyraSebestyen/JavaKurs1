import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card card, Card otherCard) {
        if (card.getSuit() == otherCard.getSuit()) {
            return card.getValue() - otherCard.getValue();
        }
        boolean betterSuit = (card.getSuit().order - otherCard.getSuit().order) > 0;
        if (betterSuit) {
            return 1;
        }
        return -1;
    }
}
