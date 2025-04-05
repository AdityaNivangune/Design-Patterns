import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aditya", 80000));
        employees.add(new Employee("Shubham", 110000));
        employees.add(new Employee("Gautam", 105000));

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while(iterator.hasNext()) {
            totalSalary += iterator.next().getSalary();
        }

        System.out.println("Total Salary: "+ totalSalary);
    }
}
