package design.decorator;

public class SugarCoffeeFixDecorator extends AbstractCoffeeFixDecorator {
    public SugarCoffeeFixDecorator(Coffee coffee) {
        super(coffee);
        super.fix("sugar");
    }
}
