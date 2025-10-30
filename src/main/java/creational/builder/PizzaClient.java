package creational.builder;

public class PizzaClient {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .setCheese("Mozzarella")
                .setDough("Thick crust")
                .build();

        System.out.println(pizza);

        try {
            Pizza pizza2 = new Pizza.Builder()
                    .setCheese("Mozzarella")
                    .setDough("")
                    .build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Pizza pizza3 = new Pizza.Builder()
                    .setCheese("Mozzarella")
                    .setDough("Thin")
                    .setToppings("Pineapple")
                    .build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
