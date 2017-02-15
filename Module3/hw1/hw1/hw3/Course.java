package Module3.hw1.hw1.hw3;

import java.util.Date;

/**
 * Created by Vladislav on 15.02.2017.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}
