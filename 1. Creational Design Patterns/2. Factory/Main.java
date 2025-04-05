public class Main {

    public static void main(String[] args) {
        
        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee.salary());
    }

}
