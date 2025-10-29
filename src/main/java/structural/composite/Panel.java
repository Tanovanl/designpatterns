package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements  GUIComponent {
    private String name;
    private List<GUIComponent> children = new ArrayList<>();

    public Panel(String name){
        this.name = name;
    }

    public void add(GUIComponent guiComponent){
        children.add(guiComponent);
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Panel: " + name);
        for (GUIComponent component: children){
            component.render(indent + "   ");
        }
    }
}
