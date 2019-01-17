package design.decorator;

public class MilkCoffeeFixDecorator extends AbstractCoffeeFixDecorator {
    public MilkCoffeeFixDecorator(Coffee coffee) {
        super(coffee);
        super.fix("milk");
    }


}
