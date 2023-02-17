import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseList = new ArrayList<>();
        for(Exercise exercise : this.exercises) {
            exerciseList.add(exercise.getName());
        }
        return exerciseList;
    }

    public void add(String exercise) {
        Exercise newExercise = new Exercise(exercise);
        this.exercises.add(newExercise);
    }

    public void markAsCompleted(String exercise) {
        for (Exercise exercise1 : this.exercises) {
            if (exercise1.getName().equals(exercise)) {
                exercise1.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise exercise1 : this.exercises) {
            if (exercise1.getName().equals(exercise)) {
                return exercise1.isCompleted();
            }
        }
        return false;
    }

}
