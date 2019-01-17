package design.decorator;

public class Test {
    public static void main(String[] args) {
        Coffee milkSugarCoffee = new MilkCoffeeFixDecorator(new SugarCoffeeFixDecorator(new CoffeeNormal()));
        System.out.println(milkSugarCoffee.makingCoffee());
    }
}
