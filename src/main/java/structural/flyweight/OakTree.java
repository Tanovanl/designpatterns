package structural.flyweight;

public class OakTree implements TreeType{

    private final String texture;
    private final String color;

    public OakTree(){
        texture = "Oaky";
        color = "Light Borwn";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing an aok tree at (" + x + ", " + y + ") with texture: " + texture + " and color: " + color);
    }
}
