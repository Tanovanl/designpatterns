package structural.composite;

public class Button implements GUIComponent{
    private String text;

    public Button(String text){
        this.text = text;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Button: " + text);
    }
}
