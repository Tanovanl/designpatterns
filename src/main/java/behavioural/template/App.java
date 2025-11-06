package behavioural.template;

public class App {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println();
        coffee.prepareRecipe();
    }
}
