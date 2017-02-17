package module3.hw3;

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

    Course[] courses = {Deutsch, Java, frontEnd};
    Course[] courses2 = {NissanJukeCarCourse, Dota};

    Student DjangoUnchained = new Student("Django", "Unchained", 6);
    Student CapitanAmerica = new Student("America",courses2);

    CollegeStudent BabaYaga = new CollegeStudent ("Baba", "Yaga", 12, "Izbushka", 13, 25119543);
    CollegeStudent KPI = new CollegeStudent("KPI", courses2);
    CollegeStudent Deadpool = new CollegeStudent("Wade", "Wilson", 1);

    SpecialStudent Superman = new SpecialStudent("Klark", courses);
    SpecialStudent Batman = new SpecialStudent("Bruce", "Wayne", 1, "Gotham", 2, 496, 4586);
    SpecialStudent Wolwerine = new SpecialStudent("Hugh", "Jackman", 1);
}
