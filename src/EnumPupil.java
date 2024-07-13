import java.util.ArrayList;

public class EnumPupil {
    public static void main(String[] args){
        Pupil[] classRoom = new Pupil[3];

        classRoom[0] = new Pupil(1, "John", Grade.GOOD, MonthOfBirth.APR);
        classRoom[1] = new Pupil(2, "Emaly", Grade.RATHER, MonthOfBirth.OCT);
        //classRoom[2] = new Pupil(3, "Lily", Grade.WEAK, MonthOfBirth.NOV);

        for (Pupil pupil : classRoom) {
            if (pupil != null && pupil.monthOfBirth == MonthOfBirth.APR) {
                System.out.println(pupil);
            }
        }
    }
}

class Pupil {
    int id;
    String name;
    Grade level;
    MonthOfBirth monthOfBirth;

    public Pupil(int id, String name, Grade level, MonthOfBirth monthOfBirth) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.monthOfBirth = monthOfBirth;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.level.label + " " + this.monthOfBirth;
    }
}

enum Grade{
    GOOD("good", 1),
    RATHER("rather", 2),
    MEDIUM("medium", 3),
    WEAK("weak", 4);

    public final String label;
    public final int idx;

    Grade(String label, int idx) {
        this.label = label;
        this.idx = idx;
    }
}

enum MonthOfBirth{
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUN,
    JUL,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC
}