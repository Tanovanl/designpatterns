package behavioural.iterator;

public class Item {
    private String name;
    private String type;

    public Item( String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}
