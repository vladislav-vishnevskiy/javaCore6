package Module3.hw4;
import java.util.Scanner;

/**
 * Created by Vladislav on 15.02.2017.
 */
public class Work {
    public static void main(String[] args) {
        User Employee = new User("Vasya", 5, 6, "IntCorporation", 500, "uah");
        System.out.println(Employee.getBalance());

        Employee.paySalary();
        System.out.println(Employee.getBalance());
    }


    }
