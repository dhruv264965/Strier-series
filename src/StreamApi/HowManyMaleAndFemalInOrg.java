package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private double salary;

    public Employee(int id, String name, int age, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class HowManyMaleAndFemalInOrg {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Dhruv Shukla", 30, "Male", 50000),
                new Employee(2, "Arti Shukla", 25, "Female", 20000),
                new Employee(3, "Ashish Shukla", 40, "Male", 70000),
                new Employee(4, "Vandana Shukla", 35, "Female", 30000),
                new Employee(5, "Amit Shukla", 50, "Male", 90000)
        );
        // How many Male and Female in the organization.
        Map<String, Long> getGenderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Male and Female in the organization:-"+getGenderCount);
//        System.out.println("Male Employess "+getGenderCount.get("Male"));
//        System.out.println("female Employess "+getGenderCount.get("Female"));

        System.out.println("----------------------------------------------------------------");
        // Total number of Employee has Age more than 30
        long countEmployee=  employees.stream()
                .filter(employee -> employee.getAge()>30)
                .count();   ///count method is long type
        System.out.println("Employee has Age more than 30 Age "+countEmployee);

        System.out.println("----------------------------------------------------------------------");
        // print Salary more than 30000
        long salaryCount=employees.stream()
                .filter(employee -> employee.getSalary()>30000)
                .count();
        System.out.println("Employee count salary more than 30000:- " +salaryCount);

        System.out.println("---------------------------------------------------------------------");
        // print male name whose salary is 30000
    //Approch 1->
     employees.stream()
                .filter(employee -> employee.getGender().equals("Male") && employee.getSalary()>30000)
            .forEach(employee -> System.out.println(employee.getName()));

        //Approch 2->
        List<String> maleEmployeesWith30KSalary = employees.stream()
                .filter(employee -> employee.getGender().equals("Male") && employee.getSalary() > 30000)
                .map(Employee::getName) // Extract the names
                .collect(Collectors.toList()); // Collect into a list
        System.out.println(maleEmployeesWith30KSalary);// Print the list

        System.out.println("-------------------------------------------------------------------------------------------");
        //Find Average salary of male and female employee

        Map<String,Double>avgSalaryOfMaleAndFemale=employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary"+avgSalaryOfMaleAndFemale);
        System.out.println("Average salary of Male employees: " + avgSalaryOfMaleAndFemale.get("Male"));
        System.out.println("Average salary of Female employees: " + avgSalaryOfMaleAndFemale.get("Female"));


        System.out.println("------------------------------------------------------------------------");
        //find first name of the oldest employee.
        Optional<String>OldestEmployeeFirstName=employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))// Find the oldest employee
                .map(employee -> employee.getName().split(" ")[0]);// Extract the first name

        System.out.println("First name of the oldest employee: " +  // Print the result using Optional
                OldestEmployeeFirstName.orElse("No employees found"));

        System.out.println("-------------------------------------------------------------");
        // find employee with Highest salary
        Optional<Employee>highestSalary=employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestSalary.ifPresentOrElse(employee -> System.out.println("Name "+employee.getName()+"  salary "+employee.getSalary()),()-> System.out.println("Not found"));

        System.out.println("-------------------------------------------------------------------------------------");
        //Top Two highest paid employee
        List<Employee> topTwoHighestPaidEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort by salary in descending order
                .limit(2) // Limit to top 2 employees
                .collect(Collectors.toList());
        topTwoHighestPaidEmployees.forEach(employee -> // Print the result
                System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary()));

        System.out.println("----------------------------------------------------------------------------");
        //Get the total salary of all employees:
        double salary=employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("total salary of all employees "+salary);
        System.out.println("------------------------------------------------------------");


    }

}
