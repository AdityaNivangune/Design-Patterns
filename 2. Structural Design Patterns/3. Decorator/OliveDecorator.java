public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza decoratePizza) {
        super(decoratePizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olive";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.75;
    }
}
