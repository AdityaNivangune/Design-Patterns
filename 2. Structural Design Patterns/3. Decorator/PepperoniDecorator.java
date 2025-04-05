public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratePizza) {
        super(decoratePizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.0;
    }
}
