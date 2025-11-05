package behavioural.strategy;

public class App {
    public static void main(String[] args) {
        String text = "Dit is een text";
        TextEditor textEditor = new TextEditor();

        textEditor.publishText(text);

        textEditor.setTextFormatter(new UpperCaseFormatter());
        textEditor.publishText(text);

        textEditor.setTextFormatter(new LowerCaseFormatter());
        textEditor.publishText(text);

    }
}
