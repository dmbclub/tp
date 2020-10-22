package fitr.storage;

import fitr.Exercise;
import fitr.Food;
import fitr.Goal;
import fitr.list.ExerciseList;
import fitr.list.FoodList;
import fitr.list.GoalList;
import fitr.user.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class StorageManager {
    protected static final String COMMA_SEPARATOR = ",";
    private final ExerciseStorage exerciseStorage;
    private final FoodStorage foodStorage;
    private final GoalStorage goalStorage;
    private final TipStorage tipStorage;
    private final UserStorage userStorage;

    public StorageManager() throws IOException {
        exerciseStorage = new ExerciseStorage();
        foodStorage = new FoodStorage();
        goalStorage = new GoalStorage();
        tipStorage = new TipStorage();
        userStorage = new UserStorage();
    }

    public ArrayList<Exercise> loadExerciseList() throws FileNotFoundException {
        return exerciseStorage.loadExerciseList();
    }

    public void writeExerciseList(ExerciseList exerciseList) throws IOException {
        exerciseStorage.writeExerciseList(exerciseList);
    }

    public ArrayList<Food> loadFoodList() throws FileNotFoundException {
        return foodStorage.loadFoodList();
    }

    public void writeFoodList(FoodList foodList) throws IOException {
        foodStorage.writeFoodList(foodList);
    }

    public User loadUserProfile() throws FileNotFoundException {
        return userStorage.loadUserProfile();
    }

    public void writeUserProfile(User user) throws IOException {
        userStorage.writeUserProfile(user);
    }

    public ArrayList<Goal> loadGoalList() throws FileNotFoundException {
        return goalStorage.loadGoalList();
    }

    public void writeGoalList(GoalList goalList) throws IOException {
        goalStorage.writeGoalList(goalList);
    }

    public ArrayList<String> loadTipList() throws IOException {
        return tipStorage.loadTipList();
    }
}
