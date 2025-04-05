public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratePizza) {
        super(decoratePizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5;
    }
}
