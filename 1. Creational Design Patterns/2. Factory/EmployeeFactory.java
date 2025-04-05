public class EmployeeFactory {
    
    public static Employee getEmployee(String empVal) {
        if(empVal.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if(empVal.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }

}
