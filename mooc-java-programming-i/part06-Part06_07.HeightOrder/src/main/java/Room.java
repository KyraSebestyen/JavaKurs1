import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personsInside = new ArrayList<>();

    public void add(Person person) {
        this.personsInside.add(person);
    }

    public Person shortest() {
        if (!this.isEmpty()) {
            Person shortest = this.personsInside.get(0);
            for (Person person : this.personsInside) {
                if (person.getHeight() < shortest.getHeight()) {
                    shortest = person;
                }
            }
            return shortest;
        }
        return null;
    }

    public Person take() {
        if (!this.isEmpty()) {
            Person shortest = this.shortest();
            this.personsInside.remove(shortest);
            return shortest;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.personsInside.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personsInside;
    }
}
