package behavioural.command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GameController {
    private Queue<Command> commandQueue = new LinkedList<>();
    private Stack<Command> history = new Stack<>();

    public void queueCommand(Command command){
        commandQueue.add(command);
    }

    public void executeCommands(){
        while(!commandQueue.isEmpty()){
            Command cmd = commandQueue.poll();
            cmd.execute();
            history.push(cmd);
        }
    }

    public void execute(Command cmd){
        cmd.execute();
        history.push(cmd);
    }

    public void undoLastCommand(){
        if (history.isEmpty()) System.out.println("No Commands to undo");
        else {
            Command last = history.pop();
            System.out.println("Undoing last command");
            last.undo();
        }
    }
}
