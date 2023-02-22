import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees = new ArrayList<>();

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    public void print() { // must use Iterator
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                System.out.println(employee);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
