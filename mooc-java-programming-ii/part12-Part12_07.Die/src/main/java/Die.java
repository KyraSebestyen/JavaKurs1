
import java.util.Random;

public class Die {

    private final Random random = new Random();
    private final int numberOfFaces;

    public Die(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        return random.nextInt(numberOfFaces) + 1;
    }
}
