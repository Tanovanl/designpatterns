package behavioural.memento;

public class App {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.write("Hoi");
        textEditor.showContent();

        EditHistory editHistory = new EditHistory();

        editHistory.save(textEditor.save());

        textEditor.write("ik ben tano");

        textEditor.showContent();

        textEditor.restore(editHistory.undo());
        textEditor.showContent();
    }
}
