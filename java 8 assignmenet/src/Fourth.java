//Question 4:- WAP using java 8: -> Collect all even numbers from a list using stream -> Given a list of objects of following class: class Employee{ String fullName; Long salary; String city; } Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.*;
import java.util.stream.*;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class Fourth {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);


        List<Employee> employees = Arrays.asList(
                new Employee("Yashi Raj", 4000L, "Delhi"),
                new Employee("Manshi Raj", 6000L, "Mumbai"),
                new Employee("Vishal Kumar", 4500L, "Delhi"),
                new Employee("Yashi Raj", 5000L, "Delhi"),
                new Employee("Priya Sharma", 4200L, "Delhi")
        );
        List<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equals("Delhi"))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique first names: " + uniqueFirstNames);
    }
}
