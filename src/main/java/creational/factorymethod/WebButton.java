package creational.factorymethod;

public class WebButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering web button");
    }
}
