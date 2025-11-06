package behavioural.template;

abstract public class Beverage {

    public final void prepareRecipe(){
        boilWater();
        pourInCup();
        brew();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    private void pourInCup(){
        System.out.println("Pouring water into cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}
