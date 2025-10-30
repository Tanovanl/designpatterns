package creational.builder;

public class Pizza {

    private String dough;
    private String sauce;
    private String cheese;
    private String toppings;

    private Pizza(Builder builder){
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
    }

    @Override
    public String toString(){
        return "Pizza [Dough=" + dough + ", Sauce=" + sauce +
                ", Cheese=" + cheese + ", Toppings=" + toppings + "]";
    }

    public static class Builder {
        private String dough;
        private String sauce;
        private String cheese;
        private String toppings;

        public Builder setDough(String dough){
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public Builder setCheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder setToppings(String toppings){
            this.toppings = toppings;
            return this;
        }

        public Pizza build(){
            enforceRestrictions();

            return new Pizza(this);
        }

        private void enforceRestrictions(){
            enforceNoPineApple();
            enforceNoEmptyDough();
        }


        private void enforceNoPineApple(){
            if (toppings != null && toppings.contains("Pineapple")){
                throw new IllegalArgumentException("No pineapple allowed on pizza!");
            }
        }

        private void enforceNoEmptyDough(){
            if (dough == null || dough.isEmpty()){
                throw new IllegalArgumentException("Dough must be specified");
            }
        }


    }

}
