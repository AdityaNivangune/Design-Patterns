public class Main {
    public static void main(String[] args) {
        
        // want to get Android Developer
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.salary());
        System.out.println(e1.name());
    }
}
