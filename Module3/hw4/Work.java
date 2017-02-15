package Module3.hw4;
import java.util.Scanner;

/**
 * Created by Vladislav on 15.02.2017.
 */
public class Work {
    public static void main(String[] args) {
        User Employee = new User("Vasya", 5, 6, "IntCorporation", 5000, "uah");

        Employee.paySalary();
        System.out.println(Employee.getBalance());

        Employee.withdraw(100);
        System.out.println(Employee.getBalance());

        System.out.println(Employee.companyNameLength());

        Employee.monthIncreaser(1);
        System.out.println(Employee.getMonthsOfEmployment());
    }
}
