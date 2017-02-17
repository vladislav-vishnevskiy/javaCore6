package module3.hw3;

import java.util.Date;

/**
 * Создать следующую структуру классов.
 * Класс Course с полями:
 * Date startDate,
 * String name,
 * int hoursDuration,
 * String teacherName.
 * ---
 * Создайте 2 конструктора с аргументами
 * startDate, name;
 * hoursDuration, name, teacherName.
 * ---
 * Класс Student с полями:
 * String firstName,
 * String lastName,
 * int group,
 * Course[] coursesTaken,
 * int age.
 * ---
 * С 2 конструкторами с аргументами
 * firstName, lastName, group;
 * lastName, coursesTaken.
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

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}
