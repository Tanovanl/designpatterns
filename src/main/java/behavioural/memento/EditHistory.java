package behavioural.memento;

import java.util.Stack;

public class EditHistory {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento editorMemento){
        history.push(editorMemento);
    }

    public EditorMemento undo(){
        if (!history.isEmpty()){
            return history.pop();
        }
        return null;
    }
}
