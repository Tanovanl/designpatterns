package behavioural.memento;

public class TextEditor {
    private String content = "";

    public void write(String text){
        content += text;
    }

    public void showContent(){
        System.out.println("[CONTENT]: " + content);
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento editorMemento){
        content = editorMemento.getContent();
    }
}
