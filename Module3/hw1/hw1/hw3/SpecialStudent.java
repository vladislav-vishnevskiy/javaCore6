package Module3.hw1.hw1.hw3;

/**
 * Created by Vladislav on 15.02.2017.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id, long secretKey) {
        super(lastName, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;
    }
}
