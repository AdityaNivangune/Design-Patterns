public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza decoratePizza) {
        super(decoratePizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0;
    }
}
