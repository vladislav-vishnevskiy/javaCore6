package Module3.hw3;

import java.util.Date;

/**
 * Created by Vladislav on 15.02.2017.
 */
public class Solution {
    Course Deutsch = new Course ("Deutsch", 100, "Adolf Hitler");
    Course Java = new Course (new Date(2017, 12, 11), "Java" );
    Course frontEnd = new Course ("frontEnd", 50, "frontEndTeacher");
    Course NissanJukeCarCourse = new Course ("NissanJukeCarCourse", 2, "Gorilla");
    Course Dota = new Course ("Dota", 1, "RAK");

    Student DjangoUnchained = new Student("Django", "Unchained", 6);
    Student CapitanAmerica = new Student("Cap", "America", 12);
    Student Deadpool = new Student("Wade", "Wilson", 1);
    Student Wolwerine = new Student("James", "Howlett", 1);

    CollegeStudent BabaYaga = new CollegeStudent ("Baba", "Yaga", 12, "Izbushka", 13, 25119543);
    CollegeStudent KPI = new CollegeStudent ("Student", "Programist", 1, "KPI", 1, 111);

    SpecialStudent Superman = new SpecialStudent("Clark", "Kent", 1, "Kripton", 1, 100, 256);
    SpecialStudent Batman = new SpecialStudent("Bruce", "Wayne", 1, "Gotham", 2, 496, 4586);
}
