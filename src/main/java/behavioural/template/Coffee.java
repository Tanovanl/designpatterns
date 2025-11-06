package behavioural.template;

public class Coffee extends Beverage{
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
