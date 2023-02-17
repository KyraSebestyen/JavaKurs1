public class Bird {
    private String name;
    private String latinName;
    int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public void increaseObserved() {
        this.observed++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (this.observed == 1) {
            return this.name + " (" + this.latinName + "): " + this.observed + " observation";
        }
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
}
