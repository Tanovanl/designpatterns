package behavioural.template;

public class Tea extends Beverage{
    @Override
    protected void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
