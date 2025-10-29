package structural.decorator;

public class MakeCoffee {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Description: " + coffee.getDescription() + "\nCost: " + coffee.getCost());
    }

}
