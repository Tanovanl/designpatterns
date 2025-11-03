package structural.flyweight;

public class PineTree implements TreeType{

    private final String texture;
    private final String color;

    public PineTree() {
        this.texture = "Rough Bark";
        this.color = "Green";
        System.out.println("Creating a Pine Tree Type (shared)");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a Pine Tree at (" + x + ", " + y + ") with texture: " + texture + " and color: " + color);
    }
}
