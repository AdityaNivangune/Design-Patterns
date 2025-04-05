public class PlainPizza implements Pizza {
    
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double cost() {
        return 8.0;
    }
}
