import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("this");
        assertTrue(management.exerciseList().contains("this"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("this thingy");
        management.markAsCompleted("this thingy");
        assertTrue(management.isCompleted("this thingy"));
    }
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("this again");
        management.markAsCompleted("this again");
        assertFalse(management.isCompleted("something else"));
    }
}
