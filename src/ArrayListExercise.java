import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Pupil> classRoom = new ArrayList<>();

        classRoom.add(new Pupil(1, "John", Grade.GOOD, MonthOfBirth.APR));
        classRoom.add(new Pupil(2, "Emaly", Grade.RATHER, MonthOfBirth.OCT));
        classRoom.add(new Pupil(3, "Lily", Grade.WEAK, MonthOfBirth.NOV));

        // Delete everything:
        // classRoom.clear();

        /* Delete at a particular index:
            classRoom.remove(1);
            classRoom.removeFirst(); */

        // Change an item
        // classRoom.set();

        classRoom.add(null);

        for (Pupil pupil : classRoom) {
            if (pupil != null && pupil.monthOfBirth == MonthOfBirth.APR) {
                System.out.println(pupil);
            }
        }
    }
}
