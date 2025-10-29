package structural.composite;

public class Label implements GUIComponent{
    private String text;

    public Label(String text){
        this.text = text;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Label: " + text);
    }
}
