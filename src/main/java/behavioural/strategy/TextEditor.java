package behavioural.strategy;

public class TextEditor {
    private TextFormatter textFormatter;

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text){
        if (textFormatter == null) System.out.println(text);
        else System.out.println(textFormatter.format(text));
    }
}
